package org.dimigo.oop;

public class BookTest2 {

    private static boolean flag;

    private static void compare() {
        int a = 10;
        int b = a;

        System.out.println(a==b?"true" : "false");

        Book book = new Book();
        Book book2 = book;
        System.out.println(book==book2?"true":"false");

        book2.setTitle("수학의 정석");
        System.out.println(book.getTitle());


        book2 = new Book();
        System.out.println(book==book2?"true":"false");
    }



    private static void methodB(int num) {
        num++;
        System.out.println(num);
    }

    private static void methodA(int num) {
    }


    private static void methodC(Book book) {
        System.out.println(book.getTitle());
        book.setTitle("과학의 바이블");
        book = new Book("이것이 자바다");
        System.out.println(book.getTitle());
    }

    private static void methodD(Book book) {
        book.setTitle("영어의 바이올린");
    }

    public static void main(String[] args) {
        System.out.println(flag);
        compare();

        System.out.println("------------------------------------------");

        int num = 5;
        methodA(num);
        System.out.println(num);
        System.out.println("------------------------------------------");

        methodB(num);
        System.out.println(num);
        System.out.println("------------------------------------------");


        Book book = new Book("수학의 바이블");
        methodC(book);
        System.out.println(book.getTitle());
        System.out.println("------------------------------------------");


        methodD(book);
        System.out.println(book.getTitle());
        System.out.println("------------------------------------------");

        // Book book2 = null;
        Book book2 = new Book();
        System.out.println(book2);
        System.out.println(book2.getTitle());
        System.out.println(book2.getTitle().length());
    }

}
