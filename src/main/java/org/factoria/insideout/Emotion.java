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
        return "Hi, I´m " + this.color + ",mi color es" + this.color;
    }
}
