package com.accenture.coffeemaker.model;

public class BeanTray extends CoffeeAccessory {

    private Integer coffeeAmount;

    public BeanTray() {
        this.coffeeAmount = 10;
    }

    public Integer getCoffeeAmount() {
        return coffeeAmount;
    }

    public void setCoffeeAmount(Integer coffeeAmount) {
        this.coffeeAmount = coffeeAmount;
    }

    public String isAvailable() {
        return "Your bean tray is empty.";
    }
}
