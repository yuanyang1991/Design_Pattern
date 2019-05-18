package com.yuany.dp.simpleFactory;

import com.yuany.dp.Pizza;

public class SimplePizzaStore {


    public Pizza order(String type){
        Pizza pizza = SimplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
