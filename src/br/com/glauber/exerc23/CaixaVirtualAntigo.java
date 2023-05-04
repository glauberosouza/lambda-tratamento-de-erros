package br.com.glauber.exerc23;

public class CaixaVirtualAntigo<T> {
    T item;

    public void guardar(T item) {
        this.item = item;
    }

    public T pegar() {
        return item;
    }
}