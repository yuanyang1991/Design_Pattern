package store

import pizza.Pizza
import pizza.ca.CAStyleChessPizza
import pizza.ca.CAStyleVegePizza
import java.lang.RuntimeException

class CAPizzaStore : AbstractPizzaStore() {

    override fun createPizza(type: String): Pizza {
        if ("chess" == type){
            return CAStyleChessPizza()
        } else if ("vege" == type){
            return CAStyleVegePizza()
        }
        throw RuntimeException("No Such pizza.Pizza with Name $type")
    }
}
