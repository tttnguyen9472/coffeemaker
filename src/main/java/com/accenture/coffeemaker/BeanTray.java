package com.accenture.coffeemaker;

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

    public boolean isAvailable() {
        if (coffeeAmount > 0){
            return true;
        }
        return false;
    }
}
