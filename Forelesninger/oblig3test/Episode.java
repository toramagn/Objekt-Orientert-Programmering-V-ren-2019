package no.hiof.torama.movietime;


public class Episode extends Produksjon {
    private int episodeNummer, sesongNummer;

    public Episode(String tittel, int episodeNummer, int sesongNummer) {
        this(tittel, episodeNummer, sesongNummer, 0);
    }

    public Episode(String tittel, int episodeNummer, int sesongNummer, String beskrivelse, Person regissor, int spilletid, LocalDate utgivelsesdato) {
        //Oppgave 4
        // Kaller konstruktooren til super-klassen Produksjon
        super(tittel, spilletid, beskrivelse, utgivelsesdato, regissor);
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


    @Override
    public String toString() {
        return "S" + String.format("%02d", sesongNummer) + "E" + String.format("%02d", episodeNummer) + " - " + super.getTittel();
    }
}
