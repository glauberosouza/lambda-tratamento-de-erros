package br.com.glauber.exerc14;

import java.util.List;

public class SobreReduce {
    public static void main(String[] args) {
        List<Sensor> sensors = List.of(
                new Sensor(12),
                new Sensor(4),
                new Sensor(14)
        );
        sensors.stream()
                .map(s -> s.getDetectados())
                .filter(deteccoes -> deteccoes > 10)
                .reduce((ac, deteccoes) -> ac + deteccoes)
                .ifPresent(System.out::println);

        // Usando o method reference
        sensors.stream()
                .map(Sensor::getDetectados)
                .filter(deteccoes -> deteccoes > 10)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}