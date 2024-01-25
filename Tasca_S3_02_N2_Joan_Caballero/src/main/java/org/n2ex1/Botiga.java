package org.n2ex1;

import org.n2ex1.MetodesPagament.MetodePagament;

public class Botiga {
    private String nom;
    public Botiga(String nom){
        this.nom = nom;
    }
    public void pagament(MetodePagament mP){
        Passarela pasarela = new Passarela(this, mP);
        pasarela.execute();
    }
    public void callback(){
        System.out.println("Pagament realitzat");
    }
}
