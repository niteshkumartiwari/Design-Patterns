package ObserverPattern;

import java.util.HashSet;
import java.util.Set;

class WeatherStation implements IObservable {
    private Integer temperature;
    private Set<IObserver> observerSet = new HashSet<IObserver>();

    @Override
    public void addObservers(IObserver observer) {
        observerSet.add(observer);
    }

    @Override
    public void removeObservers(IObserver observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observerSet)
            observer.update();

    }

    public Integer getTemperature() {
        return this.temperature;
    }

    public void setTemperature(Integer val) {
        if (val == this.temperature)
            return;
        this.temperature = val;
        notifyObservers();
    }

}
