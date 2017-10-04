package singleton;

public class SingletonFifth {

}

enum SingletonEnum{

    INSTANCE;

    private SingletonFifth singletonFifth = new SingletonFifth();

    public SingletonFifth getInstance() {
        return singletonFifth;
    }
}
