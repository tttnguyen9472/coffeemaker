package com.accenture.coffeemaker;

public class CoffeeMaker {

    private final BeanTray beanTray;
    private final ServeTray serveTray;
    private final Display display;

    public CoffeeMaker() {
        this.beanTray = new BeanTray();
        this.serveTray = new ServeTray();
        this.display = new Display();
    }

    public void makeACoffee() {
        try {
            beanTray.isAvailable();
            serveTray.isAvailable();
            reduceCoffeeAmount();
            display.displayMessage("Your coffee is ready. You can make " + beanTray.getCoffeeAmount() + " more cups with this amount.");
            serveTray.takeACup();
        } catch (EmptyBeanTrayException e){
            display.displayMessage("The bean tray is empty. Please fill the bean tray.");
        } catch (EmptyServeTrayException e){
            display.displayMessage("The serve tray is empty. Please put a cup there.");
            serveTray.putACup();
        }
    }

    private void reduceCoffeeAmount() {
        Integer coffeeAmount = beanTray.getCoffeeAmount();
        beanTray.setCoffeeAmount(coffeeAmount - 1);
    }

    public void fillBeanTray() {
        beanTray.setCoffeeAmount(10);
        System.out.println("The amount in the coffeemaker is enough for " + beanTray.getCoffeeAmount() + " cups of coffee now.");
    }
}
