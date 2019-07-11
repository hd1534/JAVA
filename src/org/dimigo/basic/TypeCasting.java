package org.dimigo.basic;

public class TypeCasting {
    public static void main(String[] args) {
        // 1. 자동 형변환 (Promotion) : 작은타입 -> 큰타입
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        //2. 강제 형변환 (casting) : 큰타입 -> 작은타입
        f = (float)d;
        l = (long)f;
        i = (int)l;
        s = (short)i;
        b = (byte)s;


        //3. 테스트
        int i2 = 128;
        byte b2 = (byte)i2;
        System.out.println(b2);
        i2 = -129;
        b2 = (byte)i2;
        System.out.println(b2);

        long l2 = 100000000000L;
        int i3 = (int)l2;
        System.out.println(i3);


    }
}
