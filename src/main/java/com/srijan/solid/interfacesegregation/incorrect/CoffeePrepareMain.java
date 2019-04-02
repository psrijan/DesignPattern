package com.srijan.solid.interfacesegregation.incorrect;

public class CoffeePrepareMain {

    private String FLAVOR_VANILA = "vanila";

    public static void main(String[] args ) {

        CoffeePrepareMain coffeePrepareMain = new CoffeePrepareMain();


//        try {
//            ExpressooCoffeeMachine expressooCoffeeMachine = new ExpressooCoffeeMachine();
//            expressooCoffeeMachine.addGroundCoffee(new GroundCoffee());
//            expressooCoffeeMachine.brewEspresso();
//        } catch (Exception ex ) {
//            ex.printStackTrace();
//        }

//        try {
//            ExpressooCoffeeMachine expressooCoffeeMachine = new ExpressooCoffeeMachine();
//            expressooCoffeeMachine.addGroundCoffee(new GroundCoffee());
//            expressooCoffeeMachine.addFlavor(coffeePrepareMain.FLAVOR_VANILA);
//            expressooCoffeeMachine.brewEspresso();
//
//        } catch (Exception ex ) {
//            ex.printStackTrace();
//        }

        //Correct Case for Brew Coffee Machine
//        try {
//            BrewCoffeMachine brewCoffeMachine = new BrewCoffeMachine();
//            brewCoffeMachine.addFlavor("Vanila");
//            brewCoffeMachine.addGroundCoffee(new GroundCoffee());
//            brewCoffeMachine.brewFilterCoffee();
//
//        } catch (Exception ex ) {
//            ex.printStackTrace();
//        }

        try {
            BrewCoffeMachine brewCoffeMachine = new BrewCoffeMachine();
            brewCoffeMachine.addFlavor("Vanila");
            brewCoffeMachine.addGroundCoffee(new GroundCoffee());
            brewCoffeMachine.brewEspresso();

        } catch (Exception ex ) {
            ex.printStackTrace();
        }

    }
}
