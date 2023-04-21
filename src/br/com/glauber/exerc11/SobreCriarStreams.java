package br.com.glauber.exerc11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SobreCriarStreams {
    public static void main(String[] args) {
        System.out.println("=========CRIANDO STREAM COM OF=========");
        var planetasSistemaSolar = Stream.of("Mercurio", "Venus", "Terra");
        planetasSistemaSolar.forEach(System.out::println);

        System.out.println();

        String[] tresProximosPlanetas = {"Marte", "Jupiter", "Saturno"};
        Stream.of(tresProximosPlanetas).forEach(System.out::println);

        System.out.println("=========CRIANDO STREAM COM ARRAY.STREAM=========");
        String[] tresProximosPlanetas2 = {"Urano", "Netuno", "Plutao"};
        Arrays.stream(tresProximosPlanetas2).forEach(System.out::println);

        Arrays.stream(tresProximosPlanetas2, 0,2)
                .forEach(System.out::println);

        System.out.println("=========CRIANDO STREAM COM LIST.STREAM=========");
        var tresPlanetasAleatorios = List.of("TOI 700", "Kepler 16-49", "Kepler 456");
        tresPlanetasAleatorios.stream().forEach(System.out::println);
        System.out.println();
        tresPlanetasAleatorios.parallelStream().forEach(System.out::println);

        System.out.println("=========CRIANDO STREAM COM LIST.GENERATE=========");
        /*Stream.generate(() -> "Hello").forEach(System.out::println);*/
        System.out.println("=========CRIANDO STREAM COM LIST.ITERATE=========");
        /*Stream.iterate(0, n -> n + 1).forEach(System.out::println);*/
    }
}