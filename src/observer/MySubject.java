package observer;

public class MySubject extends AbstractSubject{
    @Override
    public void operation() {
        notifyObservers();
    }
}
