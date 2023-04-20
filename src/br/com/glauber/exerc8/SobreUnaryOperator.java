package br.com.glauber.exerc8;

import java.util.function.UnaryOperator;

public class SobreUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> somarCom2 = valor -> valor +2;
        UnaryOperator<Integer> multiplicarPor2 = valor -> valor * 2;
        UnaryOperator<Integer> aoQuadrado = valor -> valor * valor;

        var resultado = somarCom2.andThen(multiplicarPor2).andThen(aoQuadrado).apply(10);
        var resultadoCompose = somarCom2.compose(multiplicarPor2).compose(aoQuadrado).apply(10);

        System.out.println("A operação de (+), (*) e (²) é:  " + resultado);
        System.out.println("A operação de (+), (*) e (²) é:  " + resultadoCompose);
    }
}