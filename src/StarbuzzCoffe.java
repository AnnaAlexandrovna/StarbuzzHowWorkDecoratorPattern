import BeverageFolder.Beverage;
import BeverageFolder.Espresso;
import BeverageFolder.HouseBlend;
import CondimentFolder.Mocha;
import CondimentFolder.Soy;

public class StarbuzzCoffe {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }
}
