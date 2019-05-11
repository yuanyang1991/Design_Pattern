package quack;


/**
 * 会瓜瓜叫的鸭子
 */
public class Quack implements IQuackBehavior {


    @Override
    public void quack() {
        System.out.println("gua gua");
    }
}
