package org.example.tombola;

import java.util.*;

public class Tombola {
    protected int number;

    public void estrai() {
        Random random = new Random();

        //numero massimo estraibile
        number = 90;

        //aggiungo 0 così non lo estraggo nella tombola
        int zero = 0;

        //creo la lista di numeri già estratti in un HASHSET che non contiene duplicati
        Set<Integer> numeriEstratti = new HashSet<>();

        //aggiungo 0 per non trovarlo
        numeriEstratti.add(zero);

        //loop che mi itera tra tutti i 90 numeri
        for (int i = 0; i < number; i++) {

            //istanzio il numero random
            int random_number;

            //esgeuo l'estrazione fin quando i numeri non sono presenti nella mia lista
            do {
                random_number = random.nextInt(number);
            } while (numeriEstratti.contains(random_number));

            //aggiungo i numeri random alla mia lista
            numeriEstratti.add(random_number);

            //stampo in console i numeri non duplicati estratti
            System.out.print(random_number + ",");

        }
    }

    public void estrai2() throws InterruptedException {
        List<Integer> listaNumeri = new ArrayList<>();
        Random random = new Random();
        int numeroMax = 90;

        // Insert 90 random numbers into the list
        for (int i = 0; i < numeroMax; i++) {
            int numeroCasuale = random.nextInt(numeroMax);
            listaNumeri.add(numeroCasuale);
        }

        // Remove numbers from the list using randomly generated indices
        int size = listaNumeri.size();
        for (int i = 0; i < size; i++) {
            int indexCasuale = random.nextInt(listaNumeri.size());
            int numeroRimosso = listaNumeri.remove(indexCasuale);
            System.out.print(numeroRimosso);

            if (i < size - 1) {
                System.out.print(" , ");
            }
            Thread.sleep(100);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Tombola tombola = new Tombola();
        System.out.print("Numeri estratti - ");
        tombola.estrai();
        tombola.estrai2();
    }
}
