package adapter.classAdapter;

public class ClassAdapter extends ClassSource implements ClassTarget {
    @Override
    public void text() {
        System.out.println("this is the targetable method");
    }
}
