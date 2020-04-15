package DecoratorPattern;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozzarela(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDiscription());
        System.out.println("Price: " + basicPizza.getCost());
    }
}