package com.jechoi.java.prac.prac1.abstracts;

import com.jechoi.java.prac.prac1.interfaces.Talkable;

public abstract class Human extends A_Creature implements Talkable {
    public Human(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void attack() {
        System.out.println("도구사용으로 공격!!");
    }

    @Override
    public void talk() {
        System.out.println("사람 언어로 말을 한다.");
    }
}
