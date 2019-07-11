package org.dimigo.basic;

public class Short_Circuit {
    public static void main(String[] args) {

        //short-circuit 테스트
        boolean flag = true;
        int a = 10;
        int b = 0;
/*
        if (flag || (a / b == 0)){
            System.out.println("OR 연산");
        }

        if (!flag && (a / b == 0)){
            System.out.println("AND 연산");
        }
*/
        if (true || print());
        System.out.println("\n:::::::::\n");
        if (true && print());
        System.out.println("\n:::::::::\n");
        if (false || print());
        System.out.println("\n:::::::::\n");
        if (false && print());

        // 문자열 연결 연산자

        String name = "김자바";
        int grade = 2;
        int num = 1;
        System.out.println(name + grade + num);
        System.out.println(grade + num + name);


        String school = "디미고";
        grade = 2;
        int klass = 5; //class 는 예약어 이다
        name = "황재현";

        System.out.println(school + grade + klass + name);
        System.out.println(grade + klass + school + name);
        System.out.println("" + grade + klass + school + name);
        System.out.println(grade + (klass + school) + name);
        System.out.println(Integer.toString(grade) + klass + school + name);

    }

    public static boolean print()
    {
        System.out.println("출력됨");
        return true;
    }
}
