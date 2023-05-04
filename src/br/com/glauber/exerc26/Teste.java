package br.com.glauber.exerc26;

public class Teste {
    public static void main(String[] args) {
        var myMap = new MyMap<Integer, String>();
        myMap.put(1, "Sorvete");
        myMap.put(2, "Melancia");
        myMap.put(3, "Bombom");
        try {
            myMap.put(4, null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myMap.get(2));
    }
}