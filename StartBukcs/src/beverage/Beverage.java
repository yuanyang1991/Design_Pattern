package beverage;

/**
 *所有饮料抽象基类
 */
public abstract class Beverage {


    /**
     * 获取价格
     * @return
     */
    public abstract double cost();


    /**
     * 饮料/调料描述
     * @return
     */
    public abstract String desc();

}
