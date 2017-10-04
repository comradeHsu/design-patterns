package singleton;

/**
 * 双重校验锁
 */
public class SingletonSixth {

    private volatile static SingletonSixth instance;

    private SingletonSixth(){}

    public static final SingletonSixth getInstance(){
        if(instance == null){
            synchronized (instance){
                instance = new SingletonSixth();
            }
        }
        return instance;
    }
}
