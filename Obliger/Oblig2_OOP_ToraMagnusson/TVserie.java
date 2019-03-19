import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TVserie {


    private ArrayList<Episode> episoder = new ArrayList<Episode>();

    //Oppgave 3
    //Instansvariabler
    private String tittel;
    private String beskrivelse;
    private LocalDate utgivelsesdato;
    //oppgave 6
    private int antallEpisoder;
    //Oppgave 7
    private double gjennomsnittligSpilletid; 
    //Oppgave 9
    private int antallSesonger;

    //Oppgave 3
    public TVserie(String tittel, String beskrivelse, LocalDate utgivelsesdato, int antallEpisoder){
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = utgivelsesdato;
        this.antallEpisoder = antallEpisoder;
    }

    //Metoder for aa hente ut tittel, beskrivelse, utgivelsesdato og antallEpisoder
    public String getTittel(){
        return tittel;
    }
    public String getBeskrivelse(){
        return beskrivelse;
    }
    public LocalDate getUtgivelsesdato(){
        return utgivelsesdato;
    }
    //Oppgave 6
    public int getAntallEpisoder(){
        return antallEpisoder;
    }

    //Oppgave 9
    public int getAntallSesonger(){
        antallSesonger = 0;
        for(int i = 0; i < episoder.size(); i ++) {
            if(antallSesonger <= episoder.get(i).getSesong()){
                antallSesonger = episoder.get(i).getSesong();
            }
        }
        return antallSesonger;
    }

    //Oppgave 3
    public void leggTilEpisode(Episode episode){
    //Oppgave 9
        getAntallSesonger();
        if(episode.getSesong() <= antallSesonger+1){ //om sesongne til episoden er lik eller mindre enn antall sesonger
            //legge episode til i tvserie

            //Kun foolgene linje; oppgave 3
            episoder.add(episode);
            // Oppdaterer gjennomsnittlig spilletid
            oppdaterGjennomsnittligSpilletid();

            // Sjekker om episoden sitt sesongNummer er akkurat 1 høyere enn antallSesonger, i så fall, oppdater den
            if (antallSesonger < episode.getSesong()) {
                antallSesonger = episode.getSesong();
            }
        }
        else {
            System.out.println("Serien har ikke kommet til denne sesongen enda..");
        }
    }

    //Oppgave 4
    public List<Episode> getEpisoder(){
        return episoder;
    }

    //Oppgave 7
    public double getGjennomsnittligSpilletid(){
        oppdaterGjennomsnittligSpilletid();
        return gjennomsnittligSpilletid;
    }

    //Oppgave 7
    private double oppdaterGjennomsnittligSpilletid(){
        double totalt = 0;
        for(int i = 0; i < episoder.size(); i++){
            Episode episode = episoder.get(i);
            totalt = totalt + episode.getSpilletid(); //plusser paa spilletiden for hver episode
        }
        gjennomsnittligSpilletid = totalt/episoder.size(); //deler den totale spilletidne paa antall episoder
        
        return gjennomsnittligSpilletid;
    }

    //Oppgave 5
    @Override
    public String toString() {
        return "TVSerie{" +
                "\nTittel= '" + tittel + '\'' +
                ", \nBeskrivelse= '" + beskrivelse + '\'' +
                ", \nUtgivelsesdato= " + utgivelsesdato +
                ", \nAntall episoder= " + antallEpisoder +
                "\n}";
    }
}