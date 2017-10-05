package observer;

public class ObserverFirst implements Observer{
    @Override
    public void update() {
        System.out.println("我收到了通知");
    }
}
