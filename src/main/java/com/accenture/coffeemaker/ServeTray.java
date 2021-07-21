package com.accenture.coffeemaker;

public class ServeTray extends CoffeeAccessory {

    private boolean hasACup = false;

    public boolean getHasACup() {
        return hasACup;
    }

    public void setHasACup(boolean hasACup) {
        this.hasACup = hasACup;
    }

    public boolean isAvailable() {
        if (!hasACup){
            return false;
        }
        return true;
    }

    public void putACup(){
        this.hasACup = true;
    }
}
