package com.jechoi.java.prac.prac2;

public class prac2Main {
    public static void main(String[] args) {
        Chlid chlid1 = new Chlid("민수", "민수아빠");
        Person person1 = chlid1;
        System.out.println(person1.getName());
        System.out.println(chlid1.getParent());
    }
}
