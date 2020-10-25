package com.jechoi.java.prac.prac1.abstracts;

public abstract class Animal extends A_Creature{
    public Animal(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void attack() {
        System.out.println("몸을 날려서 공격!!");
    }
}
