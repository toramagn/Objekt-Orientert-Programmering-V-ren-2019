package no.hiof.torama.oblig3;


import java.time.LocalDate;
import java.util.ArrayList;

public class TvSerie {
    private String tittel, beskrivelse;
    private LocalDate utgivelsesdato;
    private ArrayList<Episode> episodeListe = new ArrayList<>();
    private int gjennomSnittligSpilletid, antallSesonger, antallEpisoder;
    private Episode rolle;
    private ArrayList<Episode> rolleListe = new ArrayList<Episode>();

    public TvSerie(String tittel, String beskrivelse, LocalDate utgivelsesdato) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = utgivelsesdato;
    }

    public void leggTilEpisode(Episode episoden) {
        //Oppgave 10
        antallEpisoder = 0;
        if (episoden.getSesongNummer() <= antallSesonger + 1) {
            episodeListe.add(episoden);
            oppdaterGjennomsnittligSpilletid();
            //Oppgave 10
            antallEpisoder++;

            if (antallSesonger < episoden.getSesongNummer()) {
                antallSesonger = episoden.getSesongNummer();
            }
        } else {
            System.out.println("FEIL: Episoden \"" + episoden + "\" kan ikke vaere hooyere enn sesong: " + (antallSesonger + 1));
        }
    }

    public ArrayList<Episode> hentEpisoderISesong(int sesongNummer) {
        ArrayList<Episode> episoderISesong = new ArrayList<>();

        for (Episode episode : episodeListe) {
            if (episode.getSesongNummer() == sesongNummer) {
                episoderISesong.add(episode);
            }
        }

        return episoderISesong;
    }

    private void oppdaterGjennomsnittligSpilletid() {
        int totalSpilletid = 0;

        for (Episode episode : episodeListe) {
            totalSpilletid += episode.getSpilletid();
        }

        gjennomSnittligSpilletid = totalSpilletid / episodeListe.size();
    }

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

    public ArrayList<Episode> getEpisodeListe() {
        return episodeListe;
    }

    public int getGjennomSnittligSpilletid() {
        return gjennomSnittligSpilletid;
    }

    public int getAntallSesonger() {
        return antallSesonger;
    }


    //Oppgave 9
    @Override
    public String toString() {
        return "TV Serie: " + tittel + " - " + utgivelsesdato.getYear() + "Antall sesonger: " + getAntallSesonger();
    }


    //Oppgave 10
    public void hentRollebesetning(){
        for(Episode episode : episodeListe){
            if(episode.getRolleListe() != null){
                System.out.println("\n" + episode.getRolleListe());
            }
        }
    }
}