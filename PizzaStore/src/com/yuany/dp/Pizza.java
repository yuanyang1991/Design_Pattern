package com.yuany.dp;


/**
 * 批萨抽象类
 */
public abstract class Pizza {


    String name;

    /**
     * 面
     */
    String dough;

    /**
     * 酱汁
     */
    String sauce;

    /**
     * 芝士
     */
    String chess;


    public Pizza(String name){
        this.name = name;
    }

    /**
     * 准备阶段,每种不同批萨准备阶段不同
     */
    public abstract void prepare();

    /**
     * 烘陪阶
     */
    public void bake(){
        System.out.println(name + " is baking");
    }

    /**
     * 切
     */
    public void cut(){
        System.out.println(name + " is cutting");
    }

    /**
     * 打包阶段
     */
    public void box(){
        System.out.println(name + " is boxing");
    }

}
