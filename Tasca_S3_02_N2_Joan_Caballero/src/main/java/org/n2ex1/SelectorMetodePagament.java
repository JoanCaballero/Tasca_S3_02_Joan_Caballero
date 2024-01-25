package org.n2ex1;

import org.n2ex1.MetodesPagament.Compte;
import org.n2ex1.MetodesPagament.MetodePagament;
import org.n2ex1.MetodesPagament.Paypal;
import org.n2ex1.MetodesPagament.Targeta;

import java.util.Scanner;

public class SelectorMetodePagament {
    public static MetodePagament selectorPagament(float preu){
        MetodePagament mP = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el mètode de pagament: Paypal-Compte-Targeta");
        String option = sc.nextLine();
        switch(option){
            case "Paypal" -> mP = new Paypal(preu);
            case "Compte" -> mP = new Compte(preu);
            case "Targeta" -> mP = new Targeta(preu);
        }
        return mP;
    }
}
