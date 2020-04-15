package DecoratorPattern;

// Every Pizza made will start as a PlainPizza
public class PlainPizza implements Pizza {

    @Override
    public String getDiscription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Dough: " + 4.00);
        return 4.00;
    }

}