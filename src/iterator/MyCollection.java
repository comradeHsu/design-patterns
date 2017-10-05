package iterator;

import java.util.Arrays;

public class MyCollection<E> implements Collection<E> {

    private Object[] elements;

    private int size;

    public MyCollection(){
        elements = new Object[10];
    }

    public MyCollection(int size){
        elements = new Object[size];
    }

    public MyCollection(E[] elements){
        this.elements = elements;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator<E>(this.toItr());
    }

    @Override
    public E get(int i) {
        if(i > elements.length-1){
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E)elements[i];
    }

    @Override
    public boolean add(E element) {
        if(size+1 >= elements.length){
            elements = Arrays.copyOf(elements,size*2);
        }
        elements[size++] = element;
        return true;
    }

    @Override
    public int size() {
        return elements.length;
    }

    public E[] toArray(){
        return (E[]) Arrays.copyOf(elements,size);
    }

    public MyCollection toItr(){
        return new MyCollection(this.toArray());
    }
}
