package org.factoria.insideout;

import org.factoria.Interfaces.DailyRoutine;
import org.factoria.Interfaces.Feeding;

public class Human extends CharacterInsideOut implements DailyRoutine, Feeding {

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

    @Override
    public void weakeup() {
        System.out.println("Estoy despierta");
    }

    @Override
    public void sleep() {
        System.out.println("durmiendo");
    }

    @Override
    public void eat() {
        System.out.println("Estoy comiendo");
    }
}
