import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random; //oppgave 8
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {

    //Oppgave 3
    //lager variabel for dato
    LocalDate date1 = LocalDate.of(2008,1,20);
    TVserie nyTVserie = new TVserie("Modern Family", "Comedy", date1, 20);
    //printer ut om serien
    System.out.println("\nTV-serie:" + 
        "\nTittel: " + nyTVserie.getTittel() + 
        "\nBeskrivelse: " + nyTVserie.getBeskrivelse() + 
        "\nUtgivelsesdato: " + nyTVserie.getUtgivelsesdato() +
        "\nAntall episoder: " + nyTVserie.getAntallEpisoder());

    //Oppgave 4
    ArrayList<Episode> episoder = (ArrayList<Episode>) nyTVserie.getEpisoder();
    //Lager tre nye episoder
    Episode episode1 = new Episode(1, 1, "Biler", 55);
    nyTVserie.leggTilEpisode(episode1);
    Episode episode2 = new Episode(1, 2, "Sjef", 45);
    nyTVserie.leggTilEpisode(episode2);
    Episode episode3 = new Episode(1, 5, "Sommer", 68); //tester feilmelding her ved aa legge til i sesong 5 som ikke eksisterer enda
    nyTVserie.leggTilEpisode(episode3);
    //printer ut info om de tre episodene som blir laget over
    for(int i = 0; i < episoder.size(); i++) {
        episoder.get(i).printUtEpisodeInfo();
    }

    //Oppgave 5, override toString() metoden
    //System.out.println(nyTVserie.toString());
    System.out.println("\n" + nyTVserie);
    //System.out.println(episoder.toString());
    System.out.println("\n" + episoder);

    //Oppgave 6 & 8, lager fem sesonger med 20 episoder per sesong
    Random random = new Random();
    for(int i = 1; i < 6; i++) {
        for(int j = 1; j < 21; j++) {
            double randomTid = random.nextInt(10)+20; //spilletid/randomTid mellom 20 og 30.
            Episode episodeAlle = new Episode(j, i, "Episode", randomTid);
            nyTVserie.leggTilEpisode(episodeAlle);
        }
    }

    //Oppgave 6, printer ut alle episoder i sesong 4
    for(int i = 1; i < episoder.size(); i++){
        if(episoder.get(i).getSesong() == 4){
                episoder.get(i).printUtEpisodeInfo();
        }
    }

    //Oppgave 8
    System.out.println("\nGjennomsnittlig spilletid: " + nyTVserie.getGjennomsnittligSpilletid());


    Scanner scanner = new Scanner(System.in);

    System.out.println("\nAntall sesonger: " + nyTVserie.getAntallSesonger());

    //Oppgave 9
    System.out.println("\nSkriv inn episodenummeret: ");
    int episodenummer = Integer.parseInt(scanner.nextLine());

    System.out.println("\nSkriv inn sesong: ");
    int sesong = Integer.parseInt(scanner.nextLine());

    System.out.println("\nSkriv inn tittelen paa episoden: ");
    String tittel = scanner.nextLine();

    System.out.println("\nSkriv inn lengden paa episoden i min.sek: " + 
    "\nHvis du ikke vet lengden, skriv 0.");
    double spilletid = Double.parseDouble(scanner.nextLine());

    //Oppgave 3
    if(spilletid == 0) {
        Episode episode = new Episode(episodenummer, sesong, tittel);
        nyTVserie.leggTilEpisode(episode);
        System.out.println("\nEpisode:" + episode);
    }
    else{
        Episode episode = new Episode(episodenummer, sesong, tittel, spilletid);
        nyTVserie.leggTilEpisode(episode);
        System.out.println("\nEpisode:" + episode);
    }

    System.out.println("\nAntall sesonger: " + nyTVserie.getAntallSesonger());
    System.out.println("\nGjennomsnittlig spilletid: " + nyTVserie.getGjennomsnittligSpilletid());

    scanner.close();
    }
}

