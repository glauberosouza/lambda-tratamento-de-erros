package br.com.glauber.exerc10;

import java.util.List;

public class SobreStream {
    public static void main(String[] args) {
        var tripulantes = List.of(
                "Dozer",
                "Apoc",
                "Cypher",
                "Mouse",
                "Switch",
                "Morpheus",
                "Trinity"
        );
        System.out.println("=========USANDO FOREACH=========");
        tripulantes.forEach(System.out::println);

        System.out.println("=========USANDO WHILE=========");
        var i = tripulantes.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("=========USANDO STREAM=========");
        var stream = tripulantes.stream();
        stream.forEach(System.out::println);
    }
}