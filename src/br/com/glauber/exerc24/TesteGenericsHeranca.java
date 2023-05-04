package br.com.glauber.exerc24;

public class TesteGenericsHeranca {
    public static void main(String[] args) {
        var caixaVirtualNumber = new CaixaVirtualNumber<Double>();
        var caixaVirtualInt = new CaixaVirtualInt();
        caixaVirtualNumber.guardar(10.0);
        caixaVirtualInt.guardar(100);

        System.out.println(caixaVirtualNumber.pegar());
        System.out.println(caixaVirtualInt.pegar());
    }
}