package org.factoria;

import org.factoria.user.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Cris","Romero","cris@gmail.com");
        User user2 = new User("Rocio", "Soronellas","rocio@gmail.com");

        System.out.println(user1.getName());
        user1.setName("Cristina");
        System.out.println(user1.getName());
    }
}