package ObserverPattern;

class ComputerObserver implements IObserver {
    private IObservable observable = null;

    public ComputerObserver(IObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        display();
    }

    public void display() {
        System.out.println(observable.getTemperature());
    }

}
