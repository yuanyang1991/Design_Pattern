package com.yuany.dp.simpleFactory;

import com.yuany.dp.Pizza;

public class CAStyleCalmPizza extends Pizza {

    public CAStyleCalmPizza() {
        super("CAStyleCalmPizza");
    }

    @Override
    public void prepare() {
        System.out.println("CAStylePizza is preparing");
    }
}
