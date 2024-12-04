package org.factoria;

import org.factoria.insideout.Emotion;
import org.factoria.insideout.Human;
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

        Human rilley = new Human("Rilley", 13, "personaje principal");
        Human madreRilley = new Human("Madre de Rilley", 44, "madre del personaje principal");

        System.out.println(rilley.introduce());
        System.out.println(madreRilley.introduce());

    }
}