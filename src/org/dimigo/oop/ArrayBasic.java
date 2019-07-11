package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형: int, long. double. char  (default=' '), float, boolean, short
        // 참조형: String, Scanner, Random  etc. class

        Book book = null;
        Car car = null;

        int[] intArr = null;
        intArr = new int[5];

        printArray(intArr);

        double[] doubleArr = null;
        doubleArr = new double[5];

        printArray(doubleArr);

        // 배열 선언시 초기화
        int[] intArr2 = {1, 2, 3, 4, 5};
        printArray(intArr2);
        int[] intArr3 = new int[] {1, 2, 3, 4, 5};  // 위에랑 같다
        printArray(intArr3);

        // 참조형 배열
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "BTS";
        strArr[1] = "EXO";
        strArr[2] = "볼빨간_사춘기";
        printArray(strArr);

        String[] strArr2 = {"BTS", "EXO", "볼빨간_사춘기"};
        printArray(strArr2);

        String[] strArr3 = new String[] {"BTS", "EXO", "볼빨간_사춘기"};
        printArray(strArr3);


        // Book 타입 배열 2개짜리
        // 각 방에 Book 객체 생성 후 출력

        Book[] bookArr2 = new Book[2];
        bookArr2[0] = new Book("수학의 바이블", "김재영", 100);
        bookArr2[1] = new Book("물리의 바이블", "김상욱", 100);
        printArray(bookArr2);

        Book[] bookArr1 = {new Book("화학의 바이블", "김종수", 100),
                new Book("국어의 바이블", "성기하", 100)};
        printArray(bookArr1);

        Book[] bookArr3 = new Book[] {new Book("영어의 바이블", "전유원", 100),
                new Book("자료구조의 바이블", "하미영", 100)};
        printArray(bookArr3);


        //

        int[] intArr4 = new int[3];
        System.out.println((intArr4.length - 1));

        String[] strArr4 = new String[3];
        // System.out.println(strArr4[0].length());
        // NullPointerException

        Book[] bookArr4 = new Book[3];
        // System.out.println(bookArr4[0].length);
    }

    private static void printArray(double[] doubleArr) {
        for (double value : doubleArr){
            System.out.print(value + "  ");
        }
        System.out.println(" ");
    }

    private static void printArray(int[] intArr) {
        for (int value : intArr){
            System.out.print(value + "  ");
        }
        System.out.println(" ");
    }

    private static void printArray(String[] stringArr) {
        for (String value : stringArr){
            System.out.print(value + "  ");
        }
        System.out.println(" ");
    }

    private static void printArray(Book[] bookArr) {
        for (Book value : bookArr) {
            System.out.println(value);
            // value.print();
        }
        System.out.println(" ");
    }
}
