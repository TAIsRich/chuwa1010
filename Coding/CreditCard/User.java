package org.example;

public class User {
    private String firstName;
    private String lastName;
    private String preference;


    public User(String firstName, String lastName, String preference){
        this.firstName = firstName;
        this.lastName = lastName;
        this.preference = preference;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPreference() {
        return preference;
    }
}
