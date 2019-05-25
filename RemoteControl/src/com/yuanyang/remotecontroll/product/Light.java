package com.yuanyang.remotecontroll.product;

/**
 * 电灯
 */
public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    /**
     * 打开电灯
     */
    public void turnOn(){
        System.out.println(name +" is turn on");
    }

    /**
     * 关闭电灯
     */
    public void turnOff(){
        System.out.println(name +" is turn off");
    }
}
