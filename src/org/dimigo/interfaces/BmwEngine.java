package org.dimigo.interfaces;

import org.dimigo.abstractclass.Engine;

public class BmwEngine implements IEngine {
    @Override
    public void startEngine() {
        System.out.println("BMW 엔진 기동");
    }

    @Override
    public void stopEngine() {
        System.out.println("BMW 엔진 멈춤");
    }
}
