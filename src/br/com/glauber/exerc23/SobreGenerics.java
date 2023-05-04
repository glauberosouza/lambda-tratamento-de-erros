package br.com.glauber.exerc23;

import br.com.glauber.exerc23.generics.CaixaVirtual;

public class SobreGenerics {
    public static void main(String[] args) {
        CaixaVirtual caixaVirtual = new CaixaVirtual();
        caixaVirtual.guardar("Lapis");
        var item = (int) caixaVirtual.pegar();
        System.out.println(item);
    }
}