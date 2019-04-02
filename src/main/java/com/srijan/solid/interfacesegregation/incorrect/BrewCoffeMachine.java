package com.srijan.solid.interfacesegregation.incorrect;

import java.util.Map;

public class BrewCoffeMachine implements CoffeeMachine {

    private String flavor;

    @Override
    public CoffeeDrink brewFilterCoffee() {
        System.out.println("Adding Water to Filter Coffee ");

        System.out.println("Mixing coffee with water");

        System.out.println("Coffee Has been prepared.");

        return new CoffeeDrink();
    }

    @Override
    public void addGroundCoffee(GroundCoffee newCoffee) throws CoffeeException {

        System.out.println("Coffee Grounding Started");

        System.out.println("Coffee Grounding Complete");
    }

    @Override
    public void addFlavor( String flavor) {
        System.out.println("Adding Flavor For Brew Coffee");
        this.flavor = flavor;
    }

    @Override
    public CoffeeDrink brewEspresso() throws CoffeeException {
            throw new CoffeeException("Brew Coffee Machine Doesn't Make Expresso Coffee");
    }
}
