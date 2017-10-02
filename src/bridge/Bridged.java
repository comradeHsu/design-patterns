package bridge;

public class Bridged {

    private Bridge bridge;

    public String test(){
        return bridge.test();
    }

    public void setBridge(Bridge bridge) {
        this.bridge = bridge;
    }
}
