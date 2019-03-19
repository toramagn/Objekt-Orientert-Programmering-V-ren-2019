package no.hiof.torama.oblig4.model;



import java.time.LocalDate;
import java.util.ArrayList;

//Oblig 4 - oppgave 5 - interface
public class TvSerie implements Comparable<TvSerie> {
    //OBLIG3
    private String tittel, beskrivelse;
    private LocalDate utgivelsesdato;
    private ArrayList<Episode> episodeListe = new ArrayList<>();
    private int gjennomSnittligSpilletid, antallSesonger, antallEpisoder;
    private Episode rolle;
    private ArrayList<Episode> rolleListe = new ArrayList<Episode>();

    //OBLIG3
    public TvSerie(String tittel, String beskrivelse, LocalDate utgivelsesdato) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = utgivelsesdato;
    }

    public void leggTilEpisode(Episode episoden) {
        //OBLIG3 - Oppgave 10
        antallEpisoder = 0;
        if (episoden.getSesongNummer() <= antallSesonger + 1) {
            episodeListe.add(episoden);
            oppdaterGjennomsnittligSpilletid();
            //OBLIG3 - Oppgave 10
            antallEpisoder++;

            if (antallSesonger < episoden.getSesongNummer()) {
                antallSesonger = episoden.getSesongNummer();
            }
        } else {
            System.out.println("FEIL: Episoden \"" + episoden + "\" kan ikke vaere hooyere enn sesong: " + (antallSesonger + 1));
        }
    }
    //OBLIG3
    public ArrayList<Episode> hentEpisoderISesong(int sesongNummer) {
        ArrayList<Episode> episoderISesong = new ArrayList<>();

        for (Episode episode : episodeListe) {
            if (episode.getSesongNummer() == sesongNummer) {
                episoderISesong.add(episode);
            }
        }

        return episoderISesong;
    }

    //OBLIG3
    private void oppdaterGjennomsnittligSpilletid() {
        int totalSpilletid = 0;

        for (Episode episode : episodeListe) {
            totalSpilletid += episode.getSpilletid();
        }

        gjennomSnittligSpilletid = totalSpilletid / episodeListe.size();
    }

    //OBLIG3
    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public LocalDate getUtgivelsesdato() {
        return utgivelsesdato;
    }

    public void setUtgivelsesdato(LocalDate utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }
    //OBLIG3
    public ArrayList<Episode> getEpisodeListe() {
        return episodeListe;
    }
    //OBLIG3
    public int getGjennomSnittligSpilletid() {
        return gjennomSnittligSpilletid;
    }
    //OBLIG3
    public int getAntallSesonger() {
        return antallSesonger;
    }


    //OBLIG3 - Oppgave 9
    @Override
    public String toString() {
        return "TV Serie: " + tittel + " - " + utgivelsesdato.getYear() + " Antall sesonger: " + getAntallSesonger();
    }


    //OBLIG3 - Oppgave 10
    public void hentRollebesetning(){
        for(Episode episode : episodeListe){
            if(episode.getRolleListe() != null){
                System.out.println("\n" + episode.getRolleListe());
            }
        }
    }

    //OBLIG4
    @Override
    public int compareTo(TvSerie other){
        return this.tittel.compareTo(other.getTittel());
    }
}