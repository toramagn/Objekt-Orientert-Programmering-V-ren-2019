package no.hiof.torama.oblig4.model;


public class Rolle {
    //OBLIG3 - Oppgave 8
    private String rolleFornavn, rolleEtternavn;
    private Person skuespiller;

    //OBLIG3
    public Rolle(String rolleFornavn, String rolleEtternavn){
        this.rolleFornavn = rolleFornavn;
        this.rolleEtternavn = rolleEtternavn;
    }
    //OBLIG3
    public Rolle(String rolleFornavn, String rolleEtternavn, Person skuespiller){
        this.rolleFornavn = rolleFornavn;
        this.rolleEtternavn = rolleEtternavn;
        this.skuespiller = skuespiller;
    }

    //OBLIG3
    public String getRolleFornavn() {
        return rolleFornavn;
    }
    public void setRolleFornavn(String rolleFornavn) {
        this.rolleFornavn = rolleFornavn;
    }
    //OBLIG3
    public String getRolleEtternavn() {
        return rolleEtternavn;
    }
    public void setRolleEtternavn(String rolleEtternavn) {
        this.rolleEtternavn = rolleEtternavn;
    }
    //OBLIG3
    public Person getSkuespiller() {
        return skuespiller;
    }
    public void setSkuespiller(String rolleEtternavn) {
        this.skuespiller = skuespiller;
    }

    //OBLIG3 - metode for å hente ut fult rollenavn
    public String getFultRolleNavn(){
        return rolleFornavn + " " + rolleEtternavn;
    }

    //OBLIG3 - Oppgave 9
    @Override
    public String toString(){
        return "Rolle: " + rolleFornavn + " " + rolleEtternavn + ". Skuespiller: " + skuespiller;
    }
}

