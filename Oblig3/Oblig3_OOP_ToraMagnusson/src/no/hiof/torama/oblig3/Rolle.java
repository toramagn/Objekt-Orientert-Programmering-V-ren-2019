package no.hiof.torama.oblig3;

public class Rolle {
    //Oppgave 8
    private String rolleFornavn, rolleEtternavn;
    private Person skuespiller;


    public Rolle(String rolleFornavn, String rolleEtternavn){
        this.rolleFornavn = rolleFornavn;
        this.rolleEtternavn = rolleEtternavn;
    }
    public Rolle(String rolleFornavn, String rolleEtternavn, Person skuespiller){
        this.rolleFornavn = rolleFornavn;
        this.rolleEtternavn = rolleEtternavn;
        this.skuespiller = skuespiller;
    }

    public String getRolleFornavn() {
        return rolleFornavn;
    }
    public void setRolleFornavn(String rolleFornavn) {
        this.rolleFornavn = rolleFornavn;
    }

    public String getRolleEtternavn() {
        return rolleEtternavn;
    }
    public void setRolleEtternavn(String rolleEtternavn) {
        this.rolleEtternavn = rolleEtternavn;
    }

    public Person getSkuespiller() {
        return skuespiller;
    }
    public void setSkuespiller(String rolleEtternavn) {
        this.skuespiller = skuespiller;
    }

    //metode for å hente ut fult rollenavn
    public String getFultRolleNavn(){
        return rolleFornavn + " " + rolleEtternavn;
    }

    //Oppgave 9
    @Override
    public String toString(){
        return "Rolle:" + rolleFornavn + " " + rolleEtternavn + ". Skuespiller: " + skuespiller + ".";
    }
}

