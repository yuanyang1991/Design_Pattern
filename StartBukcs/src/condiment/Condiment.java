package condiment;

import beverage.Beverage;

/**
 * 调料超类
 */
public abstract class Condiment extends Beverage {

    protected Beverage beverage;

    public Condiment(Beverage beverage){
        this.beverage = beverage;
    }

}
