package org.factoria.insideout;

public class Emotion extends Character{
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

}
