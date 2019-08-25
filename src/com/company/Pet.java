package com.company;

public class Pet extends Animal {

    private String name;
    private Owner owner;


    void sayMyName() {
        System.out.println("My name is " + getName());
    }

    final void sayMyName(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("My name is " + getName());
        }

    }

    public String getInfo() {
        return "Age : " + " " + getAge() + " " + "Name : " + " " + getName() + " " + "Color : " + getColor() +
                " " + "Owner info : " + getOwner().getName() + " " + getOwner().getAddress();
    }


    public Pet() {
    }

    public Pet(int age, Color color, String name, Owner owner) {
        super(age, color);

        this.name = name;
        this.owner = owner;
    }


    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }
}
