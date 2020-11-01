package com.jechoi.java.prac.prac2;

public abstract class Person {
    private String name;
    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Chlid extends Person{
    private String parent;
    Chlid(String name, String parent) {
        super(name);
        this.parent = parent;
    }

    public String getParent() {
        return parent;
    }
}

class Person2Main {
    public static void main(String[] args) {
        Chlid chlid1 = new Chlid("민수", "민수아빠");
        Person person1 = chlid1;
        System.out.println(person1.getName());
        System.out.println(chlid1.getParent());

//        // 에러
//        System.out.println(person1.getParent());
    }
}
