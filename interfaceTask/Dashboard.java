package com.interfaceTask;

public class Dashboard implements LoginInterface {

    @Override
    public boolean isCorrectUsernameAndPassword(String username, String password) {
        if (username == "userDashboard" && password == "pass") {
            return true;
        } else {
            return false;
        }
    }
}
