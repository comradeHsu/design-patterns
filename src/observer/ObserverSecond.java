package observer;

public class ObserverSecond implements Observer{
    @Override
    public void update() {
        System.out.println("我也收到了通知");
    }
}
