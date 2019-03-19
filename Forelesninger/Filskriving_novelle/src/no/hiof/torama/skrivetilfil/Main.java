package no.hiof.torama.skrivetilfil;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args){
        System.out.println("Skriv tekst (\"avslutt\" for å avslutte)");

        String filsti = "novelle.txt";

        String lestTekst = "";

                                                //gjør om til en linje med tekst, buffra
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                                                                    //gjør videre om
             FileWriter filskriver = new FileWriter(filsti)) {

            while (!lestTekst.equals(("avslutt"))) {

                System.out.print(": ");

                lestTekst =bufferedReader.readLine(); //hver gang brukeren trykker enter leses den linja

                filskriver.write(lestTekst + "\n");
            }

        }
        catch (IOException ioexc) {
            System.out.println("Noe gikk galt: " + ioexc.getMessage());
        }


    }
}
