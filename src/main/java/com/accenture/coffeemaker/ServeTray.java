package com.accenture.coffeemaker;

import java.util.Random;

public class ServeTray extends CoffeeAccessory {

    public void isAvailable() throws EmptyServeTrayException {
        int randomNum = getRandomNumber();
        if (randomNum <= 3){
            return;
        }
        throw new EmptyServeTrayException("The serve tray is empty.");
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5 - 1) + 1;
    }
}
