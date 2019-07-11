package org.dimigo.oop;

public class Count {
    public static void main(String[] args) {
        /*
        Count c = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        */

        for (int i = 0; i < 10; i++){
            new Count();
        }

        System.out.println(Count.num);
    }

    private static int num = 0;

    public Count (){
        num ++;
    }

    public static int getNum() {
        return num;
    }

}
