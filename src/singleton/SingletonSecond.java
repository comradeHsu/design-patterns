package singleton;

/**
 * 懒汉式线程不安全
 */
public class SingletonSecond {

    private static SingletonSecond instance = null;

    private SingletonSecond(){}

    public static SingletonSecond getInstance(){
        if(instance == null){
            instance = new SingletonSecond();
        }
        return instance;
    }
}
