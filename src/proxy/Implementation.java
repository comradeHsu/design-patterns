package proxy;

public class Implementation implements ProxySource{
    @Override
    public String test() {
        return "hello";
    }
}
