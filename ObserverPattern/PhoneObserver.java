package ObserverPattern;

class PhoneObserver implements IObserver {
    private IObservable observable = null;

    public PhoneObserver(IObservable observable) {
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
