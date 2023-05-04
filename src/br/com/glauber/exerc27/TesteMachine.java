package br.com.glauber.exerc27;

import java.util.TreeSet;

public class TesteMachine {
    public static void main(String[] args) {

        var machineA = new Machine(100);
        var machineB = new Machine(80);
        var machineC = new Machine(30);
        var machineD = new Machine(2);

        TreeSet<Machine> machines = new TreeSet<>();
        machines.add(machineA);
        machines.add(machineB);
        machines.add(machineC);
        machines.add(machineD);

        machines.forEach(System.out::println);
    }
}