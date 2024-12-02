package org.factoria.user;

public class User {
    private String name;
    private String surname;
    private String email;

    public User (String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    public String introduce() {
        return "Hi I`m " + this.name;
    }

    public String getName() {
        return this.name;
    }

    public void  setName(String newName) {
        this.name = newName;
    }
}
