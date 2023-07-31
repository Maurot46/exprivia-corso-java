package org.example.tombola;

import java.util.*;

public class Tombola {
    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void estrai() throws InterruptedException {
        Random random = new Random();
        //numero massimo estraibile
        int num = 90;
        //aggiungo 0 così non lo estraggo nella tombola
        int zero = 0;
        //creo la lista di numeri già estratti in un HASHSET che non contiene duplicati
        Set<Integer> numeriEstratti = new HashSet<>();
        //aggiungo 0 per non trovarlo
        numeriEstratti.add(zero);
        //loop che mi itera tra tutti i 90 numeri
        for (int i = 0; i < num; i++) {
            //istanzio il numero random
            int random_number;
            do {
                random_number = random.nextInt(num);
            } while (numeriEstratti.contains(random_number));

            numeriEstratti.add(random_number);
            System.out.println("Numero estratto - " + random_number);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Tombola tombola = new Tombola();
        tombola.estrai();
    }
}
