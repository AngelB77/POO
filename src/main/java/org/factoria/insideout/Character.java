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
