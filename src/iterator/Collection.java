package iterator;

public interface Collection<E> {

    public Iterator iterator();

    /*取得集合元素*/
    public E get(int i);

    public boolean add(E element);

    /*取得集合大小*/
    public int size();
}
