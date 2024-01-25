package org.n2ex1.MetodesPagament;

public class Targeta implements MetodePagament{
    private float preu;
    public Targeta(float preu){
        this.preu = preu;
    }

    @Override
    public void processa() {
        System.out.println("Pagant " + preu + " mitjançant " + this.getClass().getSimpleName());
    }
}
