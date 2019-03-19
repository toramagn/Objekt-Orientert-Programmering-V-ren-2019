package no.hiof.torama.movietime;


public class Film extends Produksjon{
    //Oppgave 5
    private int filmAar;

    //Oppgave 5
    public Film(String tittel, Person regissor, String beskrivelse, LocalDate utgivelsesdato, int filmAar, int spilletid) {
        // Kaller konstruktooren til super-klassen Produksjon
        super(tittel, spilletid, beskrivelse, utgivelsesdato, regissor);
        this.filmAar = filmAar;
    }

    public int getFilmAar() {
        return filmAar;
    }
    public void setFilmAar(int filmAar) {
        this.filmAar = filmAar;
    }

}