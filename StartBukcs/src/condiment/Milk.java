package condiment;

import beverage.Beverage;

/**
 * 牛奶
 */
public class Milk extends Condiment {


    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }

    @Override
    public String desc() {
        return "牛奶，" + beverage.desc();
    }
}
