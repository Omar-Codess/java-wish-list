package org.lessons.java.christmas;
import java.util.List;

public class ChristmasLetter {
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
    public void send(){

    }
}
