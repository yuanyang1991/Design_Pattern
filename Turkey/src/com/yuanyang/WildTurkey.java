package com.yuanyang;

public class WildTurkey implements Turkey {


    @Override
    public void fly() {
        System.out.println("wild turkey fly");
    }

    @Override
    public void gobble() {
        System.out.println("wild turkey gobble");
    }
}