package chainOfResponsibility;

public class MyHandler extends AbstractHandler{

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name);
    }
}
