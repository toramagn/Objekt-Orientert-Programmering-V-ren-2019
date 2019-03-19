public class Oppgave3{

    private String fornavn;
    private String etternavn;
    private int alder;
    
    //Kontruktoor
    public Oppgave3(String fornavn, String etternavn, int alder) { 
        this.fornavn = fornavn; 
        this.etternavn = etternavn;
        this.alder = alder; 
    }

    //Metoder for aa hente ut studentens/elevens fornavn, etternavn og alder
	  public String getFornavn() {
	    return fornavn;
	  }
	
	  public String getEtternavn() {
	    return etternavn;
	  }
	
	  public int getAlder() {
	    return alder;
	  }

    //Metoder for aa sette fornavn, etternavn og alder paa studenten/eleven
	  public void setFornavn(String fornavn) {
	    this.fornavn = fornavn;
	  }
	
	  public void setEtternavn(String etternavn) {
	    this.etternavn = etternavn;
	  }
	
	  public void setAlder(int alder) {
	    this.alder = alder;
      }
      
      public void skrivUtElevInfo() {
          System.out.println("\nElev: " + fornavn + " " + etternavn + "\nAlder: " + alder);
      }
}
    