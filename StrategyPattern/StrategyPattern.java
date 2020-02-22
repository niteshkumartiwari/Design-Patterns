package StrategyPattern;

class StrategyPattern {
    public static void main(String[] args) {
        SimpleDisplay simpleDisplay = new SimpleDisplay();
        LowQuacking lowQuacking = new LowQuacking();
        JetFlying jetFlying = new JetFlying();
        Duck duck = new Duck(simpleDisplay, jetFlying, lowQuacking);

        duck.fly();
        duck.quack();
        duck.display();
    }
}