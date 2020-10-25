package com.jechoi.java.prac.prac1;

import com.jechoi.java.prac.prac1.abstracts.Animal;
import com.jechoi.java.prac.prac1.interfaces.Flyable;

/**
 * 비둘기
 */
public class Pigeon extends Animal implements Flyable {
    public Pigeon(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void printInfo() {
        System.out.println("비둘기: "+ toString());
    }

    @Override
    public void fly(int yDistance) {
        setY(getY() + yDistance);
    }

    @Override
    public void flyMove(int xDistance, int yDistance) {
        setX(getX() + xDistance);
        setY(getY() + yDistance);
    }
}
