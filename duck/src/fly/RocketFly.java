package fly;

/**
 * 拥有火箭速度的飞行
 */
public class RocketFly implements IFlyBehavior {


    @Override
    public void fly() {
        System.out.println("rocket fly,so fast");
    }
}
