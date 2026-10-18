package org.example;

public class EroeNonIdoneoException extends Exception{
    private String Nome;
    private int Potenza;

    public String getNome() {
        return Nome;
    }
    public int getPotenza() {
        return Potenza;
    }
    public EroeNonIdoneoException(String nome, int potenza) {
        Nome = nome;
        Potenza = potenza;
    }
}
