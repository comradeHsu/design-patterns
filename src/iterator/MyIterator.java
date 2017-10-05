package iterator;

public class MyIterator<E> implements Iterator<E> {

    private Collection<E> collection;

    private int pos = -1;

    public MyIterator(Collection collection){
        this.collection = collection;
    }

    @Override
    public E previous() {
        if(pos > 0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public E next() {
        if(pos < collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos < collection.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public E first() {
        pos = 0;
        return collection.get(pos);
    }

    @Override
    public E last() {
        pos = collection.size()-1;
        return collection.get(pos);
    }
}
