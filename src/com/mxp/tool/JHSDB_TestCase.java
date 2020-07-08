package com.mxp.tool;

public class JHSDB_TestCase {


    // -Xmx10m -XX:+UseSerialGC -XX:+UseCompressedOops // 压缩指针
    static class Test{
        static ObjectHolder staticObject = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();
        void foo(){
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done"); // 设置断点
        }
    }

    private static class ObjectHolder{}

    public static void main(String[] args) {
        Test test = new JHSDB_TestCase.Test();
        test.foo();
    }
    /*
    *
    *
  Heap Parameters:
Gen 0:   eden [0x00000007ff600000,0x00000007ff7ed588,0x00000007ff8b0000) space capacity = 2818048, 71.70722429142442 used
  from [0x00000007ff8b0000,0x00000007ff8b0000,0x00000007ff900000) space capacity = 327680, 0.0 used
  to   [0x00000007ff900000,0x00000007ff900000,0x00000007ff950000) space capacity = 327680, 0.0 usedInvocations: 0

Gen 1:   old  [0x00000007ff950000,0x00000007ff950000,0x0000000800000000) space capacity = 7012352, 0.0 usedInvocations: 0

    * */

}
