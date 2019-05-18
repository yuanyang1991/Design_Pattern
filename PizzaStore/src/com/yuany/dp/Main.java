package com.yuany.dp;

import com.yuany.dp.simpleFactory.SimplePizzaStore;

public class Main {

    public static void main(String[] args) {

        /**
         * 模拟在餐厅定了一份芝士批萨
         */
        SimplePizzaStore pizzaStore = new SimplePizzaStore();
        pizzaStore.order("chess");
    }
}
