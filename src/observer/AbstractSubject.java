package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer){
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer : observers)
            observer.update();
    }
}
