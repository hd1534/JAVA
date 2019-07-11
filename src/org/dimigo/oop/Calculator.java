package org.dimigo.oop;

public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator(10, 20);

        System.out.println(cal);

        //cal.powerOn();
        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.div());
        cal.powerOff();
        cal.powerOff();
    }

    /*인스턴스 필드*/
    private int num1, num2;
    private boolean flag;

    public Calculator() {
    }

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }


    /* instance 메소드 */
    public void powerOn(){
        if(!this.flag) {
            System.out.println("전원을 켭니다.");
            this.flag = true;
        }
    }

    public void powerOff(){
        if (flag) {
            this.flag = false;
            System.out.println("전원을 끕니다");
        }
    }

    private int add(){
        powerOn();
        return num1 + num2;
    }

    private int sub(){
        powerOn();
        return num1 - num2;
    }

    private int mul(){
        powerOn();
        return num1 * num2;
    }

    private double div(){
        this.powerOn();
        return (double)num1 / num2;
    }
}
