package com.company;

import java.awt.geom.PathIterator;

public class Animal {
    private int age;
    private Color color;

    public Animal(){}

    public Animal(int age, Color color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }
}
