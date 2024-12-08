package org.factoria.insideout;

import org.factoria.Interfaces.DailyRoutine;

public class Emotion extends CharacterInsideOut implements DailyRoutine {
    private String color;


    public Emotion(String name, int age, String color){
        super(name,age);
        this.color = color;
    }

   public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String introduce() {
        return "Hola, soy " + super.getName() + " y mi color es " + this.color;
    }

    @Override
    public void weakeup() {
        System.out.println("Estoy despierta");
    }

    @Override
    public void sleep() {
        System.out.println("durmiendo");
    }
}
