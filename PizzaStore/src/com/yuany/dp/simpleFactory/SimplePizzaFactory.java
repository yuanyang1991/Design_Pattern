package com.yuany.dp.simpleFactory;

import com.yuany.dp.NYStyleChessPizza;
import com.yuany.dp.Pizza;

/**
 * 简单工厂
 *
 * 将批萨的实例化与制作逻辑分开
 *
 * 即批萨店不会依赖单一的某个类型的批萨。依赖的是批萨抽象类。这就是依赖倒置
 */
public class SimplePizzaFactory {


    public static Pizza createPizza(String type){
        switch (type){
            case "chess":
                return new NYStyleChessPizza();
            case "calm":
                return new CAStyleCalmPizza();
        }
        throw new RuntimeException("No Such Pizza with name:" + type);
    }
}
