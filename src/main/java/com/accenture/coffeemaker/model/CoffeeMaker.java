package com.accenture.coffeemaker.model;

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
        if (beanTray.isAvailable() ==) {

        }
        if (serveTray.isAvailable() ==){

        }
        coffeeAmount--;
        return display.displayMessage();

    }

    public String fillBeanTray() {
        beanTray.setCoffeeAmount(beanTray.getCoffeeAmount() + 10);
        return "The amount of coffee in the coffeemaker is enough for + " + beanTray.getCoffeeAmount();
    }
}
