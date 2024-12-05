package org.factoria.insideout;

public class Human extends Character {

    private String rol;

    public Human(String name, int age, String rol) {
        super(name, age);
        this.rol = rol;
    }
    @Override
    public String introduce() {
        return "Hola soy " + super.getName() + ", tengo " + super.getAge() + " años y mi rol es " + this.rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
