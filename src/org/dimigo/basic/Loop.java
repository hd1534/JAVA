package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int i , j;
        for (i = 1; i < 10; i++) {
            for (j = 1; j < 10; j++)
                System.out.printf("%2d * %2d = %2d   ", i, j, i * j);
            System.out.println();
        }


        int[] arr = {1, 2, 3, 4, 5};
        for(i = 0; i < arr.length; i++){
            System.out.println(arr[i]);


        }

        for(int value : arr){
            System.out.println(value);
        }


        String[] idol = {"황예지", "이채령", "신류진", "신유나", "최지수"};
        for (String member : idol){
            System.out.println(member);
        }


        Scanner s = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("<<간식 선택>>\n" +
                    "1. 치킨\n" +
                    "2. 냉면\n" +
                    "3. 피자\n" +
                    "9. 종료");
            System.out.println("매뉴 =>");
            menu = s.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Sorry, chicken is sold out");
                    break;
                case 2:
                    System.out.println("Sorry, `냉면`is not found");
                    break;
                case 3:
                    System.out.println("Sorry, I ate all pizzas");
                    break;
                case 9:
                    System.out.println("bye bye");
                    s.close();
                    break;
                default:
                    System.out.println("Are you kidding me?");

            }
        } while (menu != 9);
    }
}
