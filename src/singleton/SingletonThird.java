package singleton;

/**
 * 懒汉式线程安全
 */
public class SingletonThird {

    private static SingletonThird instance = null;

    private SingletonThird(){}

    public static SingletonThird getInstance(){
        if(instance == null){
            synchronized (instance) {
                instance = new SingletonThird();
            }
        }
        return instance;
    }
}
