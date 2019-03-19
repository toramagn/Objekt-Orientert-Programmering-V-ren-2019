public class Elev{

    private String fornavn;
    private String etternavn;
    private int alder;
    private String studentId;

    public String getFornavn(){
        return fornavn;
    }
    public String getEtternavn(){
        return etternavn;
    }
    public int getAlder(){
        return alder;
    }
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    } 
    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }
    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }
    public void setAlder(int alder){
        this.alder = alder;
    }

    public void skrivUtStudentInfo(){
        System.out.println("\nFornavn: " + fornavn + "\nEtternavn: " + etternavn);
    }

}