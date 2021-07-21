package com.accenture.coffeemaker;

public class CoffeeMaker {

    private BeanTray beanTray;
    private ServeTray serveTray;
    private Display display;

    public CoffeeMaker() {
        this.beanTray = new BeanTray();
        this.serveTray = new ServeTray();
        this.display = new Display();
    }

    public String makeACoffee() {
        Integer coffeeAmount = beanTray.getCoffeeAmount();
        coffeeAmount = coffeeAmount - 1;
        return display.displayMessage("Your coffee is ready. You can make " + beanTray.getCoffeeAmount() + " more cups with this amount.");

    }

    public String fillBeanTray() {
        beanTray.setCoffeeAmount(10);
        return "The amount in the coffeemaker is enough for " + beanTray.getCoffeeAmount() + " cups of coffee now.";
    }
}
