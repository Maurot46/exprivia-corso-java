package org.example;


import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
        Gson gson = new Gson();

        /*try (FileWriter fileWriter = new FileWriter("person.json")){
            gson.toJson(p, fileWriter);
            System.out.println("serializzazione completa");
        }catch (IOException e){
            e.printStackTrace();
        }*/
        try(FileReader reader = new FileReader("person.json")){
            Persona p2 = gson.fromJson(reader, Persona.class);
            System.out.println("Deserializzazione completa");
            System.out.println("Nome " + p2.getNome());
            System.out.println("Cognome " + p2.getCognome());
            System.out.println("Eta " + p2.getEta());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
