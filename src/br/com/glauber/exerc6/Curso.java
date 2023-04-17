package br.com.glauber.exerc6;

public class Curso {
    private double nota;

    public Curso(double nota) {
        this.nota = nota;
    }
    public boolean foiAprovado(){
        return nota >= 6;
    }
}