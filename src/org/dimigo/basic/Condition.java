package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        int age = 17;

        // 19세 이상이면 "투표하러 가세요"
        // 아니면 "선거권이 없네요" 출력

        System.out.printf("%s\n",age>=19?"선거하러 가세요":"선궈권이 없네요");

        /*
        //주사위 굴리기
        System.out.println(new Random().nextInt(6) + 1);
*/


        int num = new Random().nextInt(6) + 1;
        System.out.println(num);
        //swtich 문을써서 짝수면 "작수입니다"
        switch (num){
            case 1:
            case 3:
            case 5:
                System.out.println("홀수입니다");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("짝수입니다.");
        }

        String menu = "떡볶이";
        switch (menu){
            case "떡볶이":
                System.out.println("떡볶이 조아여여");
               break;
            case "순대":
                System.out.println("순대 조아여");
                break;
             default:
                 System.out.println("다이어트중");
        }
    }
}
