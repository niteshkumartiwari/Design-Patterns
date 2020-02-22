package StrategyPattern;

class LowQuacking implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("Low Quacking");
    }
}