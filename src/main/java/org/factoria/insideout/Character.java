package org.factoria.insideout;

public class Character {
    private  String name;
    private int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "hola, soy " +this.name+ " y tengo " +this.age+ " años";
    }
}
