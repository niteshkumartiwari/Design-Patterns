package DecoratorPattern;

//Has a "Has a" relationship with Pizza. This is an Aggregation Relationship
abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;

    // Assigns the type instance to this attribute of a Pizza. All decorators can
    // dynamically customize the Pizza instance PlainPizza because of this

    public ToppingDecorator(Pizza pizza) {
        tempPizza = pizza;
    }

    @Override
    public String getDiscription() {
        return tempPizza.getDiscription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }

}