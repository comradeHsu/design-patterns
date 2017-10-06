package state;

/**
 * 状态模式
 */
public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void first(){
        System.out.println("execute the first opt!");
    }

    public void second(){
        System.out.println("execute the second opt!");
    }
}
