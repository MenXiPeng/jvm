package com.mxp.omm;

public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    // 设置栈内存容量 -Xss
    public static void main(String[] args) {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        }catch (Exception e){
            System.out.println("stack length:"+javaVMStackSOF.stackLength);
           throw e;
        }
    }
}
