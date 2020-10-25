package com.jechoi.java.prac;

import com.jechoi.java.prac.prac1.Kevin;
import com.jechoi.java.prac.prac1.Pigeon;

public class Main {

    public static void main(String[] args) {
        Pigeon p = new Pigeon(5, 10, 14);
        p.printInfo();
        p.age();
        p.move(100);
        p.printInfo();
        p.fly(5);
        p.printInfo();
        p.flyMove(10,20);
        p.printInfo();
        p.attack();
        System.out.println();

        Kevin kevin = new Kevin(0, 0, 35);
        kevin.printInfo();
        kevin.age();
        kevin.move(10);
        kevin.printInfo();
        kevin.attack();
        kevin.coding();
        kevin.swimDown(20);
        kevin.printInfo();
        kevin.talk();
    }
}
