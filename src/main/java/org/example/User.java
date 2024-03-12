package org.example;

public class User {
    private String username;
    private String password;
    private boolean isLoggedIn;


    // constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    // create method for logging user in
    public void login(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login Successful. Welcome, " + username + "!");

        } else {
            System.out.println("Incorrect Password. Login Failed!");
        }
    }

    // create a method for logging out the user
    public void logout(){
        isLoggedIn = false;
        System.out.println("Logout Successful. Goodbye, " + username + "!");
    }
}
