package br.com.glauber.exerc23.generics;

public class CaixaVirtual<T> {
    T item;

    public void guardar(T item) {
        this.item = item;
    }

    public T pegar() {
        return item;
    }
}