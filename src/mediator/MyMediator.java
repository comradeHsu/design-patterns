package mediator;

public class MyMediator implements Mediator{

    private User user1;
    private User user2;

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    @Override
    public void createMediator() {
        user1 = new First(this);
        user2 = new Second(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
