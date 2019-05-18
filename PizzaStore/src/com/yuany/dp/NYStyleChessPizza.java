package com.yuany.dp;

public class NYStyleChessPizza extends Pizza {


    public NYStyleChessPizza() {
        super("NYStyleChessPizza");
    }

    @Override
    public void prepare() {
        System.out.println("NYStyleChessPizza is preparing");
    }
}
