package StrategyPattern;

class SimpleDisplay implements IDisplayStrategy {
    @Override
    public void display() {
        System.out.println("Simple Display");

    }
}