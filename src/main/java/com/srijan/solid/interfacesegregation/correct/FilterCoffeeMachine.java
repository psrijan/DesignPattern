package com.srijan.solid.interfacesegregation.correct;

import com.srijan.solid.interfacesegregation.incorrect.CoffeeDrink;

public interface FilterCoffeeMachine extends  CoffeeMachine {

    CoffeeDrink brewFilterCoffee();
    void addFlavor(String flavor);

}
