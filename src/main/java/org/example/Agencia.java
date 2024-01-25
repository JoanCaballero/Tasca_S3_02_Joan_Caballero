package org.example;

public class Agencia implements AgenciaBorsa{
    private String name;
    public Agencia(String name){
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " ha rebut aquest missatge: " + message);
    }
}
