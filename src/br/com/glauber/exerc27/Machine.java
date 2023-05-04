package br.com.glauber.exerc27;

public class Machine implements Comparable<Machine> {
    private int destructionPower;

    public Machine(int destructionPower) {
        this.destructionPower = destructionPower;
    }

    @Override
    public int compareTo(Machine o) {
        return this.destructionPower - o.destructionPower;
    }

    @Override
    public String toString() {
        return "My destruction power is=" + destructionPower;
    }
}