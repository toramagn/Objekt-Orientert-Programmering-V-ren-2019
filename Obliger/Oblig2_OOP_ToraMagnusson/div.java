 /* MAIN.JAVA
 
 Utskrift episode-info
 
    //printer ut foorste episode
    episode1.printUtEpisodeInfo();
    //printer ut andre episode
    System.out.println("\nEpisodenummer: " + episode2.getEpisodenummer() + 
        "\nSesong: " + episode2.getSesong() + 
        "\nTittel: " + episode2.getTittel());
    //printer ut tredje episode
    episode3.printUtEpisodeInfo();

    //nyTVserie.printUtSerieInfo();
    //nyTVserie.toString();


    System.out.println("\nEpisodenummer: " + episoder.get(i).getEpisodenummer() + 
        "\nSesong: " + episoder.get(i).getSesong() + 
        "\nTittel: " + episoder.get(i).getTittel() + 
        "\nSpilletid " + episoder.get(i).getSpilletid() + " min.");
            
*/
/* EPISODER.JAVA

*/
/* TVSERIE.JAVA

Set-metoder
    
    //Metoder for aa sette tittel, beskrivelse eller utgivelsesdato
    public void setTittel(String tittel){
        this.tittel = tittel;
    }
    public void setBeskrivelse(String beskrivelse){
        this.beskrivelse = beskrivelse;
    }
    public void setUtgivelsesdato(LocalDate utgivelsesdato){
        this.utgivelsesdato = utgivelsesdato;
    }

        //gaar gjennom listen med episoder som TVserien har
        //for(int i = 0; i < antallEpisoder.size; i++){
            //sjekker om det nummeret vi er paa i lista staar tomt, altsaa ikke inneholder en episode
            if(antallEpisoder == null){
                //Hvis det er tomt legger vi til en ny episode paa dette stedet i lista.
                //antallEpisoder[i] = episode;
                episoder.add(episode);
                //break; //avslutter lookken
            }
        //}
        
    public void printUtSerieInfo(){
        System.out.println("\nTittel: " + tittel + 
            "\nBeskrivelse: " + beskrivelse + 
            "\nUtgivelsesdato: " + utgivelsesdato +
            "\nAntall episoder: " + antallEpisoder);
    }
    @Override
    public String toString() {
        return "TV-serie \nTittel: " + tittel + 
        "\nBeskrivelse: " + beskrivelse + 
        "\nUtgivelsesdato: " + utgivelsesdato + 
        "\nAntall episoder: " + antallEpisoder;
    }
*/