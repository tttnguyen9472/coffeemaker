package com.accenture.coffeemaker;

public class Display extends CoffeeAccessory {

    public boolean isAvailable() {
        return false;
    }

    public String displayMessage(String message){
        return message;
    }
}
