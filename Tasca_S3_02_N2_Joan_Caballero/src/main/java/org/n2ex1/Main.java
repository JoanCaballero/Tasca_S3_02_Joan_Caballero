package org.n2ex1;

public class Main {
    public static void main(String[] args){
        float preu = 125.99f;
        Botiga botiga = new Botiga("Sabateria");

        botiga.pagament(SelectorMetodePagament.selectorPagament(preu));
    }
}
