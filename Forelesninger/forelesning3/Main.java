public class Main{

    public static void main(String[] args) {
        Student nikolasTesla = new Student();

        nikolasTesla.fornavn = "Nikolas";
        nikolasTesla.etternavn = "Tesla";
        nikolasTesla.alder = 19;
        nikolasTesla.setStudentId("392");

        //System.out.println("\n" + nikolasTesla.fornavn + " " + nikolasTesla.etternavn);
        nikolasTesla.skrivUtStudentInfo(); //henviser til public void i Student.java
        System.out.println("StudentID: " + nikolasTesla.getStudentId());


        Student thomasEdison = new Student();
    
        thomasEdison.fornavn = "Thomas";
        thomasEdison.etternavn = "Edison";
        thomasEdison.alder = 30;
        thomasEdison.setStudentId("4032");

        thomasEdison.skrivUtStudentInfo();
        System.out.println("StudentID: " + thomasEdison.getStudentId());
    }

}