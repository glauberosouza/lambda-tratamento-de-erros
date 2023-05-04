package br.com.glauber.exerc23.generics;

public class SobreGenericsB {
    public static void main(String[] args) {
        var caixaVirtualA = new CaixaVirtual<String>();
        var caixaVirtualB = new CaixaVirtual<Integer>();

        caixaVirtualA.guardar("Mochila");
        caixaVirtualB.guardar(10);
        var itemA = caixaVirtualA.pegar();
        var itemB = caixaVirtualB.pegar();
        System.out.println("Item A: "+ itemA + " " + " Item B: " + itemB);
    }
}