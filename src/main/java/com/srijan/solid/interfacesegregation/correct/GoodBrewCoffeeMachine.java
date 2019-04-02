package com.srijan.solid.interfacesegregation.correct;

import com.srijan.solid.interfacesegregation.incorrect.BrewCoffeMachine;
import com.srijan.solid.interfacesegregation.incorrect.CoffeeDrink;
import com.srijan.solid.interfacesegregation.incorrect.CoffeeException;
import com.srijan.solid.interfacesegregation.incorrect.GroundCoffee;

import java.util.logging.Filter;

public class GoodBrewCoffeeMachine extends AbstractCoffeeMachine implements FilterCoffeeMachine {

    private String flavor;
    @Override
    public CoffeeDrink brewFilterCoffee() {
        System.out.println("Adding Water to Filter Coffee ");

        System.out.println("Mixing coffee with water");

        System.out.println("Coffee Has been prepared.");

        return new CoffeeDrink();
    }

    @Override
    public void addFlavor(String flavor) {
        System.out.println("Adding Flavor For Brew Coffee");
        this.flavor = flavor;
    }


}
