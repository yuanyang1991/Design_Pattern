import beverage.Espresso;
import condiment.Milk;
import condiment.Soy;

public class Main {


    public static void main(String[] args) {
        //需要一杯家牛奶和豆浆的浓咖啡
        Espresso espresso = new Espresso();

        //豆浆
        Soy soy = new Soy(espresso);

        //牛奶
        Milk milk = new Milk(soy);

        System.out.println("cost :" + milk.cost());
        System.out.println("desc :" + milk.desc());
    }
}
