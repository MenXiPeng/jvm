package com.mxp.memory;

public class Allocation {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        //XX:+UseSerialGC -- -XX:PretenureSizeThreshold // 使用serialGc 时制定大对象直接放入老年代防止新生代触发GC
        //-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation1 = new byte[4 * _1MB];
    }

}
