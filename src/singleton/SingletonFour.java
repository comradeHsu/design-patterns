package singleton;

public class SingletonFour {

    private static class SinggletonHolder{
        private static final SingletonFour instance = new SingletonFour();
    }

    private SingletonFour(){}

    public static final SingletonFour getInstance(){
        return SinggletonHolder.instance;
    }
}
