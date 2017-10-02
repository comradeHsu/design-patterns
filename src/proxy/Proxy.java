package proxy;

public class Proxy implements ProxySource {

    private ProxySource proxySource;
    public Proxy(){
        proxySource = new Implementation();
    }
    @Override
    public String test() {
        return proxySource.test();
    }
}
