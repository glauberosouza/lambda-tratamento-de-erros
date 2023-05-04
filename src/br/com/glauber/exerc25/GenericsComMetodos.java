package br.com.glauber.exerc25;

import java.util.List;

public class GenericsComMetodos {
    public static void main(String[] args) {

        var listA = List.of("Amarelo", "Preto", "Vermelho");
        var listB = List.of(10, 20, 30);
        var listC = List.of(20.0, 30.0, 40.0);

        System.out.println(pegaQualquerTipo(listA, 1));
        System.out.println(pegaQualquerTipo(listB, 0));
        System.out.println(pegaQualquerTipo(listC, 2));
    }
    public static <T> T pegaQualquerTipo(List<T> lista, int indice){
        if(indice < 0 || indice > lista.size()){
            throw new IllegalArgumentException("Indice inválido");
        }
        return lista.get(indice);
    }
}