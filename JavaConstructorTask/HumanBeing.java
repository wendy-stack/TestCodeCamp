package com.introToOop;

public class HumanBeing {

        String body;
        int wings;
        boolean powers;

    public HumanBeing(String body) {
        this.body = body;
    }

    public HumanBeing(String body, int wings) {
        this.wings = wings;
    }

    public HumanBeing(String body, int wings, boolean powers) {
        this.powers = powers;
    }

    public void printHuman (){
        System.out.println(body);
    }

}

