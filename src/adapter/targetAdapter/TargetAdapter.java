package adapter.targetAdapter;

public class TargetAdapter implements TargetTarget {

    private TargetSource source;

    public TargetAdapter(TargetSource source){
        super();
        this.source = source;
    }

    @Override
    public void test() {
        source.test();
    }

    @Override
    public void text() {
        System.out.println("something");
    }
}
