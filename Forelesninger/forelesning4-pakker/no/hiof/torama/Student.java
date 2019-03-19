package no.hiof.torama;

public class Student{

    public String fornavn;
    public String etternavn;
    public int alder;
    private String studentId;

    //Siden studentId-en over er privat, endrer vi her slik at studentId-en kan benyttes i andre filer som Main.java
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public void skrivUtStudentInfo(){
        System.out.println("\nFornavn: " + fornavn + "\nEtternavn: " + etternavn);
    }

}