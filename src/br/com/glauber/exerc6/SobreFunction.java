package br.com.glauber.exerc6;

import java.util.function.Function;
public class SobreFunction {
    public static void main(String[] args) {
        Function<Curso, Boolean> aprovadoCurso = curso -> curso.foiAprovado();
        Function<Boolean, String> alunoAprovado = aprovado ->
           aprovado ? "O ALUNO FOI APROVADO!!!" :"O ALUNO FOI REPROVADO :)";

        Curso cursoA = new Curso(6);
        Curso cursoB = new Curso(1);

        System.out.println(aprovadoCurso.andThen(alunoAprovado).apply(cursoA));
        System.out.println(aprovadoCurso.andThen(alunoAprovado).apply(cursoB));
    }
}