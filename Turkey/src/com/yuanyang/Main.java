package com.yuanyang;

public class Main {

    public static void main(String[] args) {

        Turkey turkey = new WildTurkey();
        TurkeyAdapter adapter = new TurkeyAdapter(turkey);
        adapter.fly();
        adapter.quack();
    }
}
