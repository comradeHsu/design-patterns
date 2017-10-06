package chainOfResponsibility;

public abstract class AbstractHandler implements Handler{

    protected static final int INFO = 1;

    protected static final int DEBUG = 2;

    protected static final int ERROR = 3;

    private int level;

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void handler(int level){
        if(level <= this.INFO){
            operator();
        }
        if(handler != null){
            handler.operator();
        }
    }
}
