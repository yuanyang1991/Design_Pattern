package com.yuanyang;

/**
 * 将火鸡“变身”鸭子的适配器
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        /**
         * 由于鸭子飞行距离比火鸡远，所以这里让火鸡飞5次
         */
        for (int i = 0 ;i < 5 ; i++){
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
