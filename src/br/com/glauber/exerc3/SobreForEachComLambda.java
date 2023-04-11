package br.com.glauber.exerc3;

import java.util.List;

public class SobreForEachComLambda {
    public static void main(String[] args) {
        var hovercrafts = List.of(
                "SENTINELS",
                "HARVESTERS",
                "CARETAKERS",
                "B1_SERIES",
                "AMBASSADOR_01",
                "THE_ARCHITECT",
                "DOC_BOT",
                "RUNNERS",
                "BUGS",
                "DIGGERS",
                "TOW_BOMBS",
                "ARMADAS",
                "GARBAGE_TRUCK",
                "DEUS_EX_MACHINA",
                "PROGRAMS");
        hovercrafts.forEach(hovercraft -> System.out.println(hovercraft));
        hovercrafts.forEach(System.out::println);
    }
}