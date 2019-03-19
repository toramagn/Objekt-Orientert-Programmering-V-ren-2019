package no.hiof.torama.dyrepark;

import java.time.LocalDate;

public abstract class Dyr implements{
    private String navn;
    private final int id;
    private LocalDate fodselsdato;
    private static int antallDyr = 0;

    public Dyr(String navn, LocalDate fodselsdato){
        this.navn = navn;
        this.fodselsdato = fodselsdato;
    }
    public Dyr(String navn, LocalDate fodselsdato, int id){
        this.navn = navn;
        this.id = 1000 + antallDyr++;
        this.fodselsdato = fodselsdato;
    }

    public int getId() {
        return id;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    public String getNavn(){
        return navn;
    }

    public LocalDate getFodselsdato() {
        return fodselsdato;
    }
    public void setFodselsdato(LocalDate fodselsdato) {
        this.fodselsdato = fodselsdato;
    }



    @Override
    public int compareTo(Dyr sammenLigningsdyr){
     return this.id - sammenLigningsdyr.id;
    }
    public String toString(){
        return "ID: " + id;
    }
}
