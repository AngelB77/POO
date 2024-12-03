package org.factoria.insideout;

public class Emotion {
    private String color;
    private  String name;
    private int age;

    public Emotion(String color, String name,int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public  String introduce() {
        return "Hi, I´m " + this.name + ",mi color es " + this.color + " y tengo " + this.age + " años";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
