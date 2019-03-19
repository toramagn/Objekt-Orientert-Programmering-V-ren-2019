package no.hiof.torama.oblig3;

public class Person{
    //Oppgave 7
    private String fornavn, etternavn;

    //Oppgave 7
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

    //metode for aa hente ut fulltnavn
    public String getFultNavn(){
        return fornavn + " " + etternavn;
    }

    //Oppgave 9
    @Override
    public String toString(){
        return fornavn + " " + etternavn;
    }
}