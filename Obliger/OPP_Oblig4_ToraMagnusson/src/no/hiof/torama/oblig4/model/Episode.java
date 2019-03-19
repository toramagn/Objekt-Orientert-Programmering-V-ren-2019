package no.hiof.torama.oblig4.model;

import java.time.LocalDate;


public class Episode extends Produksjon implements Comparable<Episode> {
    private int episodeNummer, sesongNummer;

    public Episode(String tittel, int episodeNummer, int sesongNummer, int spilletid) {
        super(tittel, spilletid);
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
    }

    public Episode(String tittel, int episodeNummer, int sesongNummer, String beskrivelse, int spilletid, LocalDate utgivelsesdato) {
        //OBLIG3 - Oppgave 4
        // Kaller konstruktooren til super-klassen Produksjon
        super(tittel, spilletid, beskrivelse, utgivelsesdato);
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
    }

    public int getEpisodeNummer() {
        return episodeNummer;
    }

    public void setEpisodeNummer(int episodeNummer) {
        this.episodeNummer = episodeNummer;
    }

    public int getSesongNummer() {
        return sesongNummer;
    }

    public void setSesongNummer(int sesongNummer) {
        this.sesongNummer = sesongNummer;
    }


    //OBLIG3 - Oppgave 9
    @Override
    public String toString() {
        return "Episode: S" + String.format("%02d", sesongNummer) + "E" + String.format("%02d", episodeNummer) + " - " + super.getTittel();
    }


    //OBLIG4
    @Override
    public int compareTo(Episode other){
        return Integer.compare(this.sesongNummer, other.getSesongNummer()) + Integer.compare(this.episodeNummer, other.getEpisodeNummer());
        //Kilde til denne setningen: https://stackoverflow.com/questions/21626439/how-to-implement-the-java-comparable-interface/21626632
    }
}
