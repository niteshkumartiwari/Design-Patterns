package DecoratorPattern;

// Blueprint for classes that will have decorators
public interface Pizza {
    public abstract String getDiscription();

    public abstract double getCost();
}