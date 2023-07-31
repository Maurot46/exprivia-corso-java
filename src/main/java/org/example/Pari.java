package org.example;

public class Pari {
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean isPari(){
        return (this.numero % 2 == 0);
    }

    public Boolean isDispari(){
        return isPari();
    }

    public static void main(String[] args) {
        Pari p = new Pari();
        p.setNumero(5);
        if (p.isDispari()) {
            System.out.println(p.getNumero() + " è un numero pari");
        }else {
            System.out.println(p.getNumero() + " è un numero dispari");
        }
    }
}
