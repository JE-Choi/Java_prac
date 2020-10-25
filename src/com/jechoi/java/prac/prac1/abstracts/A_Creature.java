package com.jechoi.java.prac.prac1.abstracts;

public abstract class A_Creature {
    // 외부에서 직접 접근 막기 위해서=>private으로 생성 후// set/getter 생성
    private int x;
    private int y;
    private int age;

    public A_Creature(int x, int y, int age) {
        this.x = x;
        this.y = y;
        this.age = age;
    }

    public void age(){
        age++;
    }

    public void move(int xDistance){
        x += xDistance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    // 해당 추상클래스를 상속받은 클래스에서 처리되는 방법이 동일하기에, 상위클래스에 미리 구현
    // 하지만, 하위 클래스에서 처리해야 하는 방법이 달라진다면, override로 처리 방식을 변경할 수 있음.
    public void setY(int y) {
        this.y = y;
    }

    // 해당 추상클래스를 상속받은 클래스에서 처리되는 방법이 다르기 때문에, 구현을 하위 클래스에 위임하는것.
    public abstract void attack();
    public abstract void printInfo();

    @Override
    public String toString() {
        return "x: " + x + ", y: "+y+", age: "+age;
    }
}
