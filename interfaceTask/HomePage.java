package com.interfaceTask;

public class HomePage implements LoginInterface {
    @Override
    public boolean isCorrectUsernameAndPassword(String username, String password) {

        if (username == "userHomePage" && password == "pass") {
            return true;
        } else {
            return false;
        }
    }
}
