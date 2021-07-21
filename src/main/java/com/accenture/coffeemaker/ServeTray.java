package com.accenture.coffeemaker;

public class ServeTray extends CoffeeAccessory {

    private boolean hasACup = false;

    public void isAvailable() throws EmptyServeTrayException {
        if (hasACup) {
            return;
        }
        throw new EmptyServeTrayException("The serve tray is empty.");
    }

    public void putACup() {
        this.hasACup = true;
    }

    public void takeACup() {
        this.hasACup = false;
    }
}
