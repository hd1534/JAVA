package org.dimigo.oop;

public class StringTest2 {
    private static void compareSpeed() {
        long start = System.currentTimeMillis();

        String str = "abc";
        for (int i = 0; i < 1000000; i++)
        {
            str += "def";
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void compareSpeed2() {
        long start = System.currentTimeMillis();

        StringBuffer str = new StringBuffer("abc");
        for (int i = 0; i < 1000000; i++)
        {
            str.append("def");
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void compareSpeed3() {
        long start = System.currentTimeMillis();

        StringBuilder str = new StringBuilder("abc");
        for (int i = 0; i < 1000000; i++)
        {
            str.append("def");
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) {
        String str = "디미고 ";
        str += "2학년 ";
        str += "5반 ";
        str += "황재현";
        //현재 생성된 문자열들의 갯수 = 7개


        // StringBuilder로 문자열 추가
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("5반 ").append("황재현");

        System.out.println(sb.toString());
        System.out.println(sb); // sb.toString == sb

        //compareSpeed();
        //compareSpeed2();
        compareSpeed3();
    }
}
