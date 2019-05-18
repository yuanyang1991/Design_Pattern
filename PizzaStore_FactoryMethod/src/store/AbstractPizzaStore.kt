package store

import pizza.Pizza

/**
 * 批萨店抽象类
 *
 * 制作过程不知道是那种类型的批萨。交由子类决定，将批萨店与具体的批萨解耦
 */
abstract class AbstractPizzaStore {

    /**
     * 点餐
     */
    fun order(type: String) : Pizza {
        val pizza = createPizza(type)

        //制作
        with(pizza) {
            prepare()
            bake()
            cut()
            box()
        }
        return pizza
    }


    /**
     * 工厂方法
     *
     * 交由子类来创建pizza
     */
    abstract fun createPizza(type:String) : Pizza



}
