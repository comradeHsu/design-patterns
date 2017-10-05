package iterator;

public interface Iterator<E> {

    public E previous();

    public E next();

    public boolean hasNext();

    public E first();

    public E last();
}
