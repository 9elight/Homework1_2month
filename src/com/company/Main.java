package com.company;

public class Main {

    public static void main(String[] args) {
        Owner owner = new Owner("Bill","st 15, 22h");
        Pet p1 = new Pet(5,Color.BLACK,"Barsik",owner);

        Cat c1 = new Cat(6,Color.BROWN,"Barsik",owner,"Asian");
        Cat c2 = new Cat(4,Color.BLACK,"Vasya",owner,"Birman");

        System.out.println(p1.getInfo());
        System.out.println(c1.getInfo());
        System.out.println(c2.getInfo());

        p1.sayMyName();
        p1.sayMyName(2);

        c1.sayMyName();
        c2.sayMyName();


    }
}
