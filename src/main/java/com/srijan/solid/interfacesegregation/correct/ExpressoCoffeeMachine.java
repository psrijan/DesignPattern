package com.srijan.solid.interfacesegregation.correct;

import com.srijan.solid.interfacesegregation.incorrect.CoffeeDrink;

public interface ExpressoCoffeeMachine extends CoffeeMachine {

    CoffeeDrink brewExpressoCoffee();
    void addBitterTaste();

}
