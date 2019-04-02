package com.srijan.solid.interfacesegregation.correct;

import com.srijan.solid.interfacesegregation.incorrect.GroundCoffee;

public class AbstractCoffeeMachine implements CoffeeMachine {

    @Override
    public void addGroundCoffee(GroundCoffee coffee) {
        System.out.println("Adding Water to Filter Coffee ");

        System.out.println("Mixing coffee with water");
    }
}
