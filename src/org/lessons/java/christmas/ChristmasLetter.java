package org.lessons.java.christmas;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChristmasLetter extends Main{


    String nome;
    String indirizzo;
    List<String> listaDesideri;

    public ChristmasLetter(String nome, String indirizzo, List<String> listaDesideri) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.listaDesideri = listaDesideri;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public List<String> getListaDesideri() {
        return listaDesideri;
    }
    public void setListaDesideri(List<String> listaDesideri) {
        this.listaDesideri = listaDesideri;
    }

    //METODO SEND()
    public void send() throws IllegalArgumentException{
        if (listaDesideri.size() > 5){
            throw new IllegalArgumentException("Hai inserito troppi desideri!");

        } else {
            System.out.println(nome);
            System.out.println(indirizzo);
            System.out.println(listaDesideri);
        }

        Random rdn = new Random();
        boolean buonoCativo = rdn.nextBoolean();
        if (!buonoCativo){
            throw new IllegalArgumentException("Sei un bambino cattivo!");
        }
    }
}
