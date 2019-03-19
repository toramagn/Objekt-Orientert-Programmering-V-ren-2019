package no.hiof.torama.filskrivingtilcsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainJSON {

    public static void main(String[]args) {
        System.out.println("JSON");

        Superhelt superman = new Superhelt("Superman", "Clark Kent");

        Gson gson = new Gson();

        String jsonString = gson.toJson(superman);

        System.out.println("Konvertert til JSON: " + jsonString);

        Superhelt superheltFraJson = gson.fromJson(jsonString, Superhelt.class);

        System.out.println("Konvertert fra JSON: " + superheltFraJson);
    }

    public static ArrayList<Superhelt> lesFraJson(String filsti) {
        ArrayList<Superhelt> returListe = new ArrayList<>();

        String linje = "";
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filsti))){
            while((linje = bufferedReader.readLine()) != null){
                stringBuilder.append(linje);
            }
            Superhelt[] superhelter = gson.fromJson(stringBuilder.toString(), Superhelt[].class);

            returListe.addAll(superhelter)
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
