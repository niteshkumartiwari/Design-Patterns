package StrategyPattern;

class JetFlying implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("Jet Flying");
    }
}