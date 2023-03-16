package org.lessons.java.christmas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> listaDesideri = new ArrayList<>();

        boolean stop = false;
        while (!stop) {
            System.out.println("Inserisci un desiderio nella lista:");
            String userInput = scan.nextLine();
            listaDesideri.add(userInput);
            System.out.println("Nella tua lista sono presenti: " + listaDesideri.size() + " desideri!");
            System.out.print("Vuoi fermarti?(y/n): ");
            stop = scan.nextLine().equalsIgnoreCase("y");
        }

        Collections.sort(listaDesideri);
        System.out.println(listaDesideri);

        scan.close();

        ChristmasLetter letterina = new ChristmasLetter("Omar", "via roma 15", listaDesideri);


    }
}
