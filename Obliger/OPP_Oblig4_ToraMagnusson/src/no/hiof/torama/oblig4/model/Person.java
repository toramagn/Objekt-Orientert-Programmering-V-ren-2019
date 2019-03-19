package no.hiof.torama.oblig4.model;


public class Person{
    //OBLIG3 - Oppgave 7
    private String fornavn, etternavn;

    //OBLIG3 - Oppgave 7
    public Person(String fornavn, String etternavn){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public String getFornavn() {
        return fornavn;
    }
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }
    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    //OBLIG3 - metode for aa hente ut fulltnavn
    public String getFultNavn(){
        return fornavn + " " + etternavn;
    }

    //OBLIG3 - Oppgave 9
    @Override
    public String toString(){
        return fornavn + " " + etternavn;
    }
}