package com.srijan.solid.interfacesegregation.incorrect;

public interface CoffeeMachine {
    CoffeeDrink brewFilterCoffee() throws CoffeeException;
    void addGroundCoffee(GroundCoffee newCoffee) throws CoffeeException;
    CoffeeDrink brewEspresso() throws CoffeeException;
    void addFlavor(String flavor);
}