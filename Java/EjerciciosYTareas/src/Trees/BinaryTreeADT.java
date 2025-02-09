package Trees;

import java.util.Iterator;

public interface BinaryTreeADT<T extends Comparable <T>> {
    public boolean isEmpty();
    public int size();
    public boolean contains(T elem);
    public <T extends Comparable <T>> NodoBT find (T elem);
    public Iterator<T> inOrden();
    public Iterator<T> preOrden();
    public Iterator<T> postOrden();
    public int altura();
}//class