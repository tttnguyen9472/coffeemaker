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

    public void isAvailable() throws EmptyBeanTrayException {
        if (coffeeAmount > 0){
            return;
        }
        throw new EmptyBeanTrayException("The bean tray is empty.");
    }
}
