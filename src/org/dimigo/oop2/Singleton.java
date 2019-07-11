package org.dimigo.oop2;

public class Singleton {
    // private static Singleton instance = new Singleton(); 방법 1
    private static Singleton instance;  // 방법 2
    private Singleton() {}  // 외부접근 X

    // 외부에서 호출하기 위해 static 필요(생성자가 막혀 있으므로)
    public static synchronized Singleton getInstance() {
        if (instance == null){  // 방법 2
            instance = new Singleton();
        }
        return instance;
    }

    //synchronized 쓰레드 제한(멀티 쓰레드 X)

}
