package com.mxp.tool;


import java.util.ArrayList;

public class JConsoleOOM {

    // -Xms100m -Xmx100m -XX:+UseSerialGC
    static class OOMObject{
        public byte[] placeholder = new byte[64 * 1024];
    }
    public static void fillHeap(int num) throws InterruptedException {
        var list = new ArrayList<OOMObject>();
        for (int i = 0; i < num ; i++) {
            Thread.sleep(100);
            list.add(new OOMObject());
        }
        System.gc();
        System.out.println("done");
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
