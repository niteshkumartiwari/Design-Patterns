package DecoratorPattern;

/*
Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
*/
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozzarela(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDiscription());
        System.out.println("Price: " + basicPizza.getCost());
    }
}