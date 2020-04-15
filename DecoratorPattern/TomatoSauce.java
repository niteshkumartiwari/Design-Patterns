package DecoratorPattern;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza pizza) {
        super(pizza);
        System.out.println("Adding Sauce");
    }

    // return getDescription of plainPizza and adds mozzarella
    public String getDiscription() {
        return tempPizza.getDiscription() + " ,tomato sauce";
    }

    public double getCost() {
        System.out.println("Cost of Sauce: " + .35);
        return tempPizza.getCost() + 0.35;
    }
}