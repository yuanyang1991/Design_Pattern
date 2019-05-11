import fly.IFlyBehavior;
import quack.IQuackBehavior;

/**
 * 鸭子超类
 */
public abstract class SimUDuck {


    IFlyBehavior fly;


    IQuackBehavior quack;


    /**
     * 鸭子的外观
     *
     * 每种鸭子的外形不一样，所以需要子类实现
     */
    abstract void display();


    /**
     * 鸭子游泳
     *
     * 基本每种鸭子都会游泳。而且游泳行为大致一样，所以在父类中直接实现
     */
    public void swim() {
        System.out.println("I am swimming");
    }

    /**
     * 鸭子飞行
     */
    public void performFly(){
        if (fly != null) {
            fly.fly();
        }
    }

    /**
     * 鸭子叫
     */
    public void performQuack(){
        if (quack != null) {
            quack.quack();
        }
    }



    /**
     * 获取鸭子的飞行行为
     * @return
     */
    public IFlyBehavior getFly() {
        return fly;
    }

    /**
     * 设置鸭子的飞行行为
     * @param fly
     */
    public void setFly(IFlyBehavior fly) {
        this.fly = fly;
    }

    /**
     * 获取鸭子的瓜瓜叫行为
     * @return
     */
    public IQuackBehavior getQuack() {
        return quack;
    }

    /**
     * 这只鸭子的叫行为
     * @param quack
     */
    public void setQuack(IQuackBehavior quack) {
        this.quack = quack;
    }
}
