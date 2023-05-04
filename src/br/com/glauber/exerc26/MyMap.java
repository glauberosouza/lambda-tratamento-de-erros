package br.com.glauber.exerc26;

import java.util.LinkedHashMap;

public class MyMap <C extends Number, V>{
    private LinkedHashMap<C, V> map = new LinkedHashMap<>();

    public void put(C chave, V valor){
        if(chave == null || valor == null){
            throw new IllegalArgumentException("Chave ou valor Nulo");
        }
        map.put(chave, valor);
    }
    public V get(C chave){
        if(chave == null){
            throw new IllegalArgumentException("Chave Nula");
        }
        return map.get(chave);
    }
}