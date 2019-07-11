package org.dimigo.oop;

public class Calculator2 {
    // 정적 필드
    public static void main(String[] args) {
        Calculator2 cal  = new Calculator2();
        Calculator2 cal2  = new Calculator2();
        Calculator2 cal3  = new Calculator2();

        System.out.println(Calculator2.PI);
        cal.PI = 3.14;
        System.out.println(cal3.PI);

        System.out.println(Calculator2.add(10, 20, cal));  // 같은 클래스라 Calculator2를 빼도 됨 ㅇㅅㅇ
        System.out.println(Calculator2.sub(10, 20, cal));
        System.out.println(Calculator2.mul(10, 20, cal));
        System.out.println(Calculator2.div(10, 20, cal));
        cal.powerOff();
        cal.powerOff();
    }

    public static double PI = 3.141592;
    public boolean flag;

    public void powerOn(){
        if(!flag) {
            System.out.println("전원을 켭니다.");
            flag = true;
        }
    }

    public void powerOff(){
        if (flag) {
            flag = false;
            System.out.println("전원을 끕니다");
        }
    }

    private static int add(int num1, int num2, Calculator2 cal){
        cal.powerOn();
        return num1 + num2;
    }

    private static int sub(int num1, int num2, Calculator2 cal){
        cal.powerOn();
        return num1 - num2;
    }

    private static int mul(int num1, int num2, Calculator2 cal){
        cal.powerOn();
        return num1 * num2;
    }

    private static double div(int num1, int num2, Calculator2 cal){
        cal.powerOn();
        return (double)num1 / num2;
    }
}
