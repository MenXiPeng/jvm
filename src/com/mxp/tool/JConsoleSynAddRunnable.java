package com.mxp.tool;

public class JConsoleSynAddRunnable implements Runnable{

    int a,b;

    public JConsoleSynAddRunnable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (Integer.valueOf(a)){
            synchronized (Integer.valueOf(b)){
                System.out.println(a+b);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread((new JConsoleSynAddRunnable(1,2))).start();
            new Thread(new JConsoleSynAddRunnable(2,1)).start();
        }
    }
}
