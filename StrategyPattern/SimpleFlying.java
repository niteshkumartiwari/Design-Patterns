package StrategyPattern;

class SimpleQuacking implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("Simple Flying");
    }
}