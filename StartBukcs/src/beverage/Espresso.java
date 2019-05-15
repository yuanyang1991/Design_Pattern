package beverage;

/**
 * 浓咖啡
 */
public class Espresso extends Beverage {


    @Override
    public double cost() {
        return .8;
    }

    @Override
    public String desc() {
        return "浓咖啡";
    }
}
