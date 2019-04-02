package com.srijan.solid.interfacesegregation.correct;

import com.srijan.solid.interfacesegregation.incorrect.CoffeeDrink;
import com.srijan.solid.interfacesegregation.incorrect.GroundCoffee;

public class GoodExpressoCoffeeMachine extends AbstractCoffeeMachine implements ExpressoCoffeeMachine{

    @Override
    public CoffeeDrink brewExpressoCoffee() {
        System.out.println(" Starting Expresso Coffee Brew");

        System.out.println(" Coffee Almost Brewed ");

        System.out.println(" Expresso Brew Complete  ");
        return new CoffeeDrink();
    }

    @Override
    public void addBitterTaste() {
        System.out.println("Adding Bitter Taste..");

        System.out.println("Bitter Taste add complete..");

    }

}
