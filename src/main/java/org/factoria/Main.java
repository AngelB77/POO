package org.factoria;

import org.factoria.insideout.Emotion;
import org.factoria.user.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Cris","Romero","cris@gmail.com");
        User user2 = new User("Rocio", "Soronellas","rocio@gmail.com");

        /*System.out.println(user1.getName());
        user1.setName("Angel");
        System.out.println(user1.getName());*/

        Emotion alegria = new Emotion("yellow","Alegria", 13);
        System.out.println(alegria.introduce());

        Emotion tristeza = new Emotion("blue","Tristeza",13);
        System.out.println(tristeza.introduce());

    }
}