package ObserverPattern;

interface IObservable {
    void addObservers(IObserver observer);

    void removeObservers(IObserver observer);

    void notifyObservers();

    Integer getTemperature();
}
