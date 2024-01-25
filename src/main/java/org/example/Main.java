package org.example;

public class Main {
    public static void main(String[] args) {
        AgentBorsa aB = new AgentBorsa();
        Agencia agencia1 = new Agencia("Agencia1");
        Agencia agencia2 = new Agencia("Agencia2");
        aB.addAgencia(agencia1);
        aB.addAgencia(agencia2);
        aB.borsaBaixa();
        aB.borsaPuja();
    }
}