package StrategyPattern;

class SimpleQuacking implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("Simple Quacking");
    }
}