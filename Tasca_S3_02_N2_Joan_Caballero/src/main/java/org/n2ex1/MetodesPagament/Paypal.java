package org.n2ex1.MetodesPagament;

public class Paypal implements MetodePagament{

    private float preu;
    public Paypal(float preu){
        this.preu = preu;
    }

    @Override
    public void processa() {
        System.out.println("Pagant " + preu + " mitjançant " + this.getClass().getSimpleName());
    }
}
