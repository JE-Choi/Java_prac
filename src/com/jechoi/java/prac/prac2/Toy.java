package com.jechoi.java.prac.prac2;

public abstract class Toy {
    private String name;
    private int age;

    protected enum STATUS {
        Y(1, true),
        N(2, false);

        private int tableValues;
        private boolean tableValues2;
        STATUS(int tableValues, boolean tableValues2) {
            this.tableValues = tableValues;
            this.tableValues2 = tableValues2;
        }

        public int getTableValues() {
            return tableValues;
        }

        public void setTableValues(int tableValues) {
            this.tableValues = tableValues;
        }

        public boolean isTableValues2() {
            return tableValues2;
        }

        public void setTableValues2(boolean tableValues2) {
            this.tableValues2 = tableValues2;
        }
    }

    public Toy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound(){
        System.out.println("[Toy]장난감^장난감 소리소리");
        STATUS status= STATUS.Y;
        System.out.println(status);
        System.out.println(status.tableValues);
        System.out.println(status.tableValues2);
    }

    public String getInfo(){
        System.out.println(String.format("[Toy]내 이름은 %s 이고 나이는 %s 야!", this.name, this.age));
        return String.format("[Toy]내 이름은 %s 이고 나이는 %s 야!", this.name, this.age);
    }
}

class GunToy extends Toy{
    public GunToy(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("[GunToy]빵야^빵야 소리소리");
        System.out.println(STATUS.N);
        System.out.println(STATUS.N.getTableValues());
        System.out.println(STATUS.N.isTableValues2());
        super.sound();
    }

    @Override
    public String getInfo() {
        System.out.println(String.format("[GunToy]빵야!! %s",super.getInfo()));
        return String.format("[GunToy]빵야!! %s",super.getInfo());
    }
    public void print(){
        System.out.println("노노농~");
    }
}

class ToyMain{
    public static void main(String[] args) {
        Toy toy = new GunToy("딩가총",12);
        toy.sound();
        toy.getInfo();
        ((Toy)toy).sound(); // 이런다고 부모인 Toy의 함수 실행 안됨.
//        toy.print(); => 에러
        ((GunToy)toy).print();

    }
}