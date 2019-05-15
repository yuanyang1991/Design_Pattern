package condiment;

import beverage.Beverage;

/**
 * 豆浆
 */
public class Soy extends Condiment {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return .22 + beverage.cost();
    }

    @Override
    public String desc() {
        return "豆浆" + "," + beverage.desc();
    }
}
