package com.jechoi.java.prac.prac1;

import com.jechoi.java.prac.prac1.abstracts.Human;
import com.jechoi.java.prac.prac1.interfaces.Programmer;
import com.jechoi.java.prac.prac1.interfaces.Swimable;

public class Kevin extends Human implements Programmer, Swimable {
    public Kevin(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void printInfo() {
        System.out.println("케빈: "+toString());
    }

    @Override
    public void coding() {
        System.out.println("Hello World!!");
    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY() - yDistance);
        if(getY() < -10){
            System.out.println("너무 깊이 들어가다가 죽는다!!!");
        }
    }
}
