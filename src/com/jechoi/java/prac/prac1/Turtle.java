package com.jechoi.java.prac.prac1;

import com.jechoi.java.prac.prac1.abstracts.Animal;
import com.jechoi.java.prac.prac1.interfaces.Swimable;

public class Turtle extends Animal implements Swimable {
    public Turtle(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void printInfo() {
        System.out.println("거북이: "+ toString());
    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY() - yDistance);
    }
}
