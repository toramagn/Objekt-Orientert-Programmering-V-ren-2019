public class Student{
    
    private String fornavn;
    private String etternavn;
    private int alder;
    
    //Kontruktoor
    public Student(String fornavn, String etternavn, int alder) { 
        this.fornavn = "Tom"; 
        this.etternavn = "Heine";
        this.alder = alder;
    }

    //Metoder for aa hente ut studentens/elevens fornavn, etternavn og alder
	  public String getFornavn() {
	    return this.fornavn;
	  }
	
	  public String getEtternavn() {
	    return this.etternavn;
	  }
	
	  public int getAlder() {
	    return this.alder;
	  }
}