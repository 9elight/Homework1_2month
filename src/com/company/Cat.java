package com.company;

public class Cat extends Pet {
    private String bread;

    public Cat() {

    }

    @Override
    public String getInfo() {
        return "Bread : " + getBread() + " " + super.getInfo();
    }

    public Cat(int age, Color color, String name, Owner owner, String bread) {
        super(age, color, name, owner);
        this.bread = bread;
    }

    @Override
    void sayMyName() {
        super.sayMyName();
        System.out.println("Hello!!");
    }

    public String getBread() {
        return bread;
    }
}
