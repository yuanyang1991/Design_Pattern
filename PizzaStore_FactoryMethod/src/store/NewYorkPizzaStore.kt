package store

import pizza.Pizza
import pizza.newyork.NewYorkStyleChessPizza
import pizza.newyork.NewyorkStyleVegePizza

/**
 * 纽约批萨店
 */
class NewYorkPizzaStore : AbstractPizzaStore(){


    override fun createPizza(type: String): Pizza {
        if ("chess" == type){
            return NewYorkStyleChessPizza()
        } else if ("vege" == type){
            return NewyorkStyleVegePizza()
        }
        throw RuntimeException("No Such pizza.Pizza with Name $type")
    }

}