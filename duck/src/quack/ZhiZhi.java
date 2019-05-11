package quack;


/**
 * 玩具鸭，只能 吱zhi
 */
public class ZhiZhi implements IQuackBehavior {


    @Override
    public void quack() {
        System.out.println("zhi zhi");
    }
}
