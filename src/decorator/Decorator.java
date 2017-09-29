package decorator;

/**
 * 装饰模式
 */
public class Decorator implements Source {

    private SourceImpl source;

    public Decorator(SourceImpl source){
        super();
        this.source = source;
    }

    @Override
    public String test() {
        return source.test() + " world";
    }
}
