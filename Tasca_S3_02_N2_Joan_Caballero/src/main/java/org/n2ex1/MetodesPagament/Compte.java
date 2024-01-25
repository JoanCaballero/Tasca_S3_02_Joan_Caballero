package org.n2ex1.MetodesPagament;

public class Compte implements MetodePagament{
    private float preu;
    public Compte(float preu){
        this.preu = preu;
    }

    @Override
    public void processa() {
        System.out.println("Pagant " + preu + " mitjançant " + this.getClass().getSimpleName());
    }
}
