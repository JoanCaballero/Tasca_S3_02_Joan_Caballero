package org.example;

import java.util.ArrayList;
import java.util.List;

public class AgentBorsa {
    private List<AgenciaBorsa> agencies = new ArrayList<>();
    public void addAgencia(AgenciaBorsa agencia){
        agencies.add(agencia);
    }
    public void removeAgencia(AgenciaBorsa agencia){
        agencies.remove(agencia);
    }
    private void notify(String message){
        for(AgenciaBorsa agencia : agencies){
            agencia.update(message);
        }
    }
    public void borsaPuja(){
        notify("La borsa ha pujat");
    }
    public void borsaBaixa(){
        notify("La borsa ha baixat");
    }
}
