package br.com.glauber.exerc7;

import java.util.List;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {

        Supplier<List<String>> mesesDoAno = () -> List.of(
                "Janeiro",
                "Fevereiro",
                "Março",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                "Dezembro"
        );
        mesesDoAno.get().forEach(System.out::println);
    }
}