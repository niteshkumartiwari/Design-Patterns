package StrategyPattern;

class Duck {
    IDisplayStrategy displayBehavior;
    IFlyStrategy flyBehavior;
    IQuackStrategy quackBehavior;

    public Duck(IDisplayStrategy displayBehavior, IFlyStrategy flyBehavior, IQuackStrategy quackBehavior) {
        this.displayBehavior = displayBehavior;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void display() {
        displayBehavior.display();
    }

    public void quack() {
        quackBehavior.quack();
    }

}