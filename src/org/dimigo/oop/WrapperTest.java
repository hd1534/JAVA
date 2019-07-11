package org.dimigo.oop;

import com.sun.jdi.connect.Connector;

public class WrapperTest {
    public static void main(String[] args) {
        // Wrapper 클래스 : Primitive Type을 Wrapping 하는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

        // Boxing
        // 1) 생성자
        Integer int1 = new Integer(100);
        Integer int2 = new Integer("100");

        System.out.println(int1 == int2);
        System.out.println(int1.equals(int2));

        // 2) valueOf()
        Integer int3 = Integer.valueOf(100);
        Integer int4 = Integer.valueOf("100");

        // Unboxing
        int r1 = int1.intValue();

        // 문자열 -> Primitive Type
        int a = Integer.parseInt("100");
        double b = Double.parseDouble("3.14");

        // 100 + 200  (program arguments)
        System.out.println(args);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));



        // Auto Boxing && Unboxing
        Integer int5 = new Integer(1000);
        Integer int6 = 1000; //Auto Boxing
        System.out.println(int5 + int6); // Auto Unboxing


        // 총 몇번의 AutoBoxing,
        Integer obj2 = 10; // boxing
        Integer obj3 = obj2 + 20; // unboxing & boxing
        Integer result = obj2 + obj3; // unboxing & unboxing & boxing


    }
}
