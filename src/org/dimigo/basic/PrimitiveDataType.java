package org.dimigo.basic;

public class PrimitiveDataType {
    public static void main(String[] args)
    {
        // 1. 논리형
        boolean flag = true;

        // flag가 참이면 "참입니다." 아니면 "거짓입니다."
        if(flag)
        {
            System.out.println("참입니다!");
        }
        else
        {
            System.out.println("거짓입니다");
        }

        System.out.println(flag?"참입니다.":"거짓입니다.");


        //2. 문자형
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        System.out.printf("%c, %c, %c\n", c1, c2, c3);

        // 문자열
        String name = "ITZY";
        System.out.println("My name is " + name);


        // 3. 정수형

        int l1 = 10;
        int l2 = 0b00001010;
        int l3 = 012;
        int l4 = 0x0A;
        System.out.printf("%d, %d, %d %d\n", l1, l2, l3, l4);

        byte b1 = -128;
        byte b2 = 127;
        System.out.println(b1);
        System.out.println(b2);

        // c와는 다르게 b1 = -129 이렇게 넣으면 오버플로우가 아닌 컴파일 에러가 뜬다.
        System.out.println(--b1);
        System.out.println(++b2);

        // 정수의 범위
        System.out.println("Byte : " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println("Short : " + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
        System.out.println("Int : " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
        System.out.println("Long : " + Long.MIN_VALUE + "~" + Long.MAX_VALUE);


        // 100억을 저장 하는 방법
        long a = 9999999999999L; //L을 안붙이면 int형이다! (리터럴은 int)


        // 4. 실수형
        float f1 = 3.14f;
        double d1 = 3.14;
        System.out.printf("%f, %.2f\n", f1, d1);

        // 실수 타입별 정밀도
        float f2 = 0.12345678901234567890f;
        double d2 = 0.12345678901234567890;
        System.out.print(f2 + ", ");
        System.out.println(d2);


        System.out.printf("%c, %d, %.2f, %s\n", 'A', 100, 12.345, "ITZY");

    }
}
