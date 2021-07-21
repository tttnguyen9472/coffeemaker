package com.accenture.coffeemaker;

public abstract class CoffeeAccessory {

   public abstract void isAvailable() throws EmptyBeanTrayException, EmptyServeTrayException;
}
