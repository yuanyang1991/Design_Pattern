package com.yuanyuang;

/**
 * 咖啡因饮料，封装了制作咖啡因饮料的方法
 */
public abstract class CaffeineBeverage {

    void prepare(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook();
    }

    /**
     *将水煮沸
     */
    void boilWater(){
        System.out.println("boil water");
    }

    /**
     * 放入咖啡因饮料，如咖啡或者茶叶
     */
    abstract void brew();


    /**
     * 将饮料倒入杯子
     */
    void pourInCup(){
        System.out.println("pour in cup");
    }

    /**
     * 添加调料如牛奶或者糖
     */
    abstract void addCondiments();

    /**
     * 钩子，用于子类实现
     */
    protected void hook(){

    }
}
