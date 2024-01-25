package org.n2ex1;

import org.n2ex1.MetodesPagament.MetodePagament;

public class Passarela {
    private Botiga botiga;
    private MetodePagament mP;

    public Passarela(Botiga botiga, MetodePagament mP){
        this.botiga = botiga;
        this.mP = mP;
    }

    public void execute(){
        mP.processa();
        botiga.callback();
    }
}
