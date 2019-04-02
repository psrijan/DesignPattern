package com.srijan.solid.interfacesegregation.incorrect;

public class ExpressooCoffeeMachine implements CoffeeMachine {

    @Override
    public CoffeeDrink brewFilterCoffee() throws CoffeeException {
        return null;
    }

    @Override
    public void addGroundCoffee(GroundCoffee newCoffee) throws CoffeeException {
        System.out.println("Grounding Coffee Beans for Expresso Coffee");


        System.out.println("Coffee Beans for expresso complete");
    }

    @Override
    public CoffeeDrink brewEspresso() throws CoffeeException {
        System.out.println(" Starting Expresso Coffee Brew");

        System.out.println(" Coffee Almost Brewed ");

        System.out.println(" Expresso Brew Complete  ");
        return new CoffeeDrink();
    }

    @Override
    public void addFlavor(String flavor) {
        throw new UnsupportedOperationException("Expresso Machine Doesn't add falvor");
    }
}
