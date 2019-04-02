package com.srijan.solid.interfacesegregation.correct;

import com.srijan.solid.interfacesegregation.incorrect.GroundCoffee;

public class CoffeMain {

    public static void main(String[] args ) {

        CoffeeMachine coffeeMachine = new GoodExpressoCoffeeMachine();
        coffeeMachine.addGroundCoffee(new GroundCoffee());
        ((GoodExpressoCoffeeMachine) coffeeMachine).addBitterTaste();
        ((GoodExpressoCoffeeMachine) coffeeMachine).brewExpressoCoffee();


        CoffeeMachine brewMachine = new GoodBrewCoffeeMachine();
        brewMachine.addGroundCoffee(new GroundCoffee());
        ((GoodBrewCoffeeMachine) brewMachine).addFlavor("VANILA");
        ((GoodBrewCoffeeMachine) brewMachine).brewFilterCoffee();
    }
}
