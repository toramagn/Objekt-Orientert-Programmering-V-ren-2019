package no.hiof.torama.dyrepark;

import java.util.ArrayList;

public class Dyrepark {
    private String navn;
    private ArrayList<Dyr> dyreListe;

    public Dyrepark(String navn, ArrayList<Dyr> dyreListe){
        this.navn = navn;
        this.dyreListe = new ArrayList<>();
    }
    public Dyrepark(String navn){
        this.navn = navn;
    }
    public void leggTilEtDyr(Dyr etDyr){
        dyreListe.add(etDyr);
    }

    public ArrayList<Dyr> getDyreListe() {
        return dyreListe;
    }
    public String getNavn(){
        return navn;
    }
    public void setNavn(){
        this.navn = navn;
    }
}
