package Trees;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedBT<T extends Comparable<T>> implements BinaryTreeADT<T> {

    private NodoBT<T> raiz;
    private int cont;

    @Override
    public boolean isEmpty() {
        return raiz == null;
    }//method

    @Override
    public int size() {
        return cont;
    }//method

    @Override
    public boolean contains(T elem) {
        if (isEmpty() || elem == null)
            return false;
        if (raiz.getElement().equals(elem))
            return true;            
        return contains(elem, raiz.getDer()) || contains(elem, raiz.getIzq());
    }//method

    private boolean contains(T elem, NodoBT<T> nodo){
        if (nodo == null || nodo.element == null)
            return false;
        if (nodo.getElement().equals(elem))
            return true;
        return contains(elem, nodo.getIzq()) || contains(elem, nodo.getDer());

    }//method

    @Override
    public <T extends Comparable <T>> NodoBT<T> find(T elemento) {
        return null;
    }//method   

    @Override
    public Iterator<T> inOrden() {
        ArrayList<T> lista = new ArrayList<T>();
        inOrden(raiz, lista);
        return lista.iterator();        
    }//method

    private void inOrden(NodoBT<T> nodo, ArrayList<T> lista){
        if (nodo==null)
            return;        
        inOrden(nodo.getIzq(), lista);
        lista.add(nodo.getElement());
        inOrden(nodo.getDer(), lista);
    }//method

    @Override
    public Iterator<T> preOrden() {
        ArrayList<T> lista = new ArrayList<T>();
        preOrden(raiz, lista);
        return lista.iterator();        
    }//method

    private void preOrden(NodoBT<T> nodo, ArrayList<T> lista){
        if (nodo==null)
            return;
        lista.add(nodo.getElement());
        preOrden(nodo.getIzq(), lista);
        preOrden(nodo.getDer(), lista);
    }//method

    @Override
    public Iterator<T> postOrden() {
        ArrayList<T> lista = new ArrayList<T>();
        postOrden(raiz, lista);
        return lista.iterator();                
    }//method

    private void postOrden(NodoBT<T> nodo, ArrayList<T> lista){
        if (nodo==null)
            return;        
        postOrden(nodo.getIzq(), lista);
        postOrden(nodo.getDer(), lista);
        lista.add(nodo.getElement());
    }//method

    @Override
    public int altura() {
        return altura(raiz);
    }//method

    private int altura(NodoBT<T> nodo){        
        if (nodo == null)
            return 0;
        int i, d;
        i = altura(nodo.getIzq());
        d = altura(nodo.getDer());                
        if (i > d)
            return i + 1;
        else
            return d + 1;
    }//method



    public void agrega(T elem){

    }//method
    
}//method