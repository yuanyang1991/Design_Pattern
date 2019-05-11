import fly.RocketFly;
import quack.Quack;

/**
 * Main方法
 */
public class Main {

    public static void main(String[] args) {
        RocketDuck duck = new RocketDuck();
        //火箭飞行
        duck.setFly(new RocketFly());
        /**
         * 瓜瓜叫
         */
        duck.setQuack(new Quack());

        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
    }

}
