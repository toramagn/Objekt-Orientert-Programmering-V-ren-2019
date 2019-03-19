

public class Episode {
    
    //Oppgave 3
    //Instansvariabler
    private int episodenummer;
    private int sesong;
    private String tittel;
    private double spilletid;

    //Oppgave 3
    //kontruktoor for klassen Episode
    //gir muligheten til aa sette episodenummer, sesong og tittel
    public Episode(int episodenummer, int sesong, String tittel) {
        this.episodenummer = episodenummer;
        this.sesong = sesong;
        this.tittel = tittel;
        this.spilletid = 0;
    }

    //Oppgave 3
    //kontruktoor for klassen Episode
    //gir muligheten til aa sette episodenummer, sesong, tittel og spilletid
    public Episode(int episodenummer, int sesong, String tittel, double spilletid) {
        this.episodenummer = episodenummer;
        this.sesong = sesong;
        this.tittel = tittel;
        this.spilletid = spilletid;
    }

    //Metoder for aa hente ut en episodes episodenummer, sesong, tittel og spilletid.
    
    //returnerer episodenummeret
    public int getEpisodenummer(){
        return episodenummer;
    }
    //returnerer sesongen
    public int getSesong(){
        return sesong;
    }
    //returnerer tittelen
    public String getTittel(){
        return tittel;
    }
    //returnerer spilletiden
    public double getSpilletid(){
        return spilletid;
    }

    //Metoder for aa sette episodenummer, sesong, tittel og spilletid paa en episode

    //bruker void her fordi vi ikke skal returnere noen verdi
    public void setEpisodenummer(int episodenummer) {
        this.episodenummer = episodenummer;
    }
    public void setSesong(int sesong) {
        this.sesong = sesong;
    }
    public void setTittel(String tittel) {
        this.tittel = tittel;
    }
    public void setSpilletid(double spilletid) {
        this.spilletid = spilletid;
    }

    //Instansemetode som printer ut informasjonen om data, i klassen selv til terminalen.
    public void printUtEpisodeInfo(){
        System.out.println("\nEpisodenummer: " + episodenummer + 
            "\nSesong: " + sesong + "\nTittel: " + tittel + 
            "\nSpilletid: " + spilletid + " min.");
    }

    //Oppgave 5
    @Override
    public String toString() {
        return "\nEpisode{" +
                "\nEpisodenummer= " + episodenummer +
                ", \nSesong= " + sesong +
                ", \nTittel= '" + tittel + '\'' +
                ", \nSpilletid= " + spilletid +
                "\n}";
    }

}