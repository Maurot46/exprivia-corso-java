package org.example;



public class Persona {
    String nome;
    String cognome;
    int eta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        if (eta < 0) {
            System.out.println("inserire un età compresa tra 1 e 99 anni");
        } else {
            this.eta = eta;
        }

    }

    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNome("Mario");
        p.setCognome("Rossi");
        p.setEta(25);
        System.out.println(p.getNome() + " " + p.getCognome() + " di " + p.getEta() + " anni");
    }
}
