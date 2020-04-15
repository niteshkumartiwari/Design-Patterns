package DecoratorPattern;

public class Mozzarela extends ToppingDecorator {

    public Mozzarela(Pizza pizza) {
        super(pizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    // return getDescription of plainPizza and adds mozzarella
    public String getDiscription() {
        return tempPizza.getDiscription() + " ,mozzarella";
    }

    public double getCost() {
        System.out.println("Cost of Moz: " + .50);
        return tempPizza.getCost() + 0.5;
    }

}