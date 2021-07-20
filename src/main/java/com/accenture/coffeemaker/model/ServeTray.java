package com.accenture.coffeemaker.model;

public class ServeTray extends CoffeeAccessory {

    private Boolean hasACup;

    public Boolean getHasACup() {
        return hasACup;
    }

    public void setHasACup(Boolean hasACup) {
        this.hasACup = hasACup;
    }

    public String isAvailable() {
        if (!hasACup){
            return "There is no cup on the serve tray.";
        }
    }
}
