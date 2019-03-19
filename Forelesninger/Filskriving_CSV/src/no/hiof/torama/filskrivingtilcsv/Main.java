package no.hiof.torama.filskrivingtilcsv;

import no.hiof.torama.filskrivingtilcsv.Superhelt;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String []args){
        ArrayList<Superhelt> superhelter = new ArrayList<>();

        superhelter.add(new Superhelt("Superman", "Clark Kent"));
        superhelter.add(new Superhelt("Batman", "Bruce Wayne"));
        superhelter.add(new Superhelt("Spiderman", "Peter Parker"));

        skrivTilCSVFil(superhelter, "superhelter.csv");

        ArrayList<Superhelt> superheltList = lesFraCSVFil("superhelter.csv");

        System.out.println(superheltList);
    }

    private static ArrayList<Superhelt> lesFraCSVFil(String filsti) {
        ArrayList<Superhelt> returListe = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filsti))) {
            String linje = "";

            while ((linje = bufferedReader.readLine()) != null) {
                String[] deler = linje.split(";");

                Superhelt enSuperhelt = new Superhelt(deler[0], deler[1]);

                returListe.add(enSuperhelt);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returListe;
    }

    public static void skrivTilCSVFil(ArrayList<Superhelt> superhelter, String filsti){

        try {
            BufferedWriter bufretSkriver = new BufferedWriter(new FileWriter(filsti));

            for(Superhelt enSuperhelt : superhelter) {
                bufretSkriver.write(enSuperhelt.getNavn() + ";" + enSuperhelt.getAlterEgo());

                bufretSkriver.newLine();
            }
        }
        catch (IOException ioexc){
            System.out.println("Det ble en feil: " + ioexc.getMessage());
        }
    }
}
