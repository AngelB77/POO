package org.factoria.insideout;

public class Human {

    private String name;
    private int age;
    private String rol;

    public Human(String name, int age, String rol) {
        this.name = name;
        this.age = age;
        this.rol = rol;
    }

    public String introduce() {
        return "Hola soy " + this.name + ", tengo " + this.age + " años y mi rol es " + this.rol;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
