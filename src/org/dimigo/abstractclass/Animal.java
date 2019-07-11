package org.dimigo.abstractclass;

// 추상 메소드가 하나라도 있음 클래스가 추상 이어야 한다.
// (상식적으로 추상 클래스가 아니여도 된다면 객체를 만들고 bark()을 호출하면 뭘해야함?)
public abstract class Animal {

    public void eat() {
        System.out.println("냠냠");
    }

    public abstract void bark();  //반드시 오버라이딩을 해야함. (안하면 에러)

}
