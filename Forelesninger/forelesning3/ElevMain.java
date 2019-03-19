public class ElevMain {

    public static void main(String[] args) {
        Elev nikolasTesla = new Elev();

        nikolasTesla.setFornavn("Nikolas");
        nikolasTesla.setEtternavn("Tesla");
        nikolasTesla.setAlder(19);
        nikolasTesla.setStudentId("392");

        //System.out.println("\n" + nikolasTesla.fornavn + " " + nikolasTesla.etternavn);
        nikolasTesla.skrivUtStudentInfo(); //henviser til public void i Student.java
        System.out.println("StudentID: " + nikolasTesla.getStudentId());


        Elev thomasEdison = new Elev();
    
        thomasEdison.setFornavn("Thomas");
        thomasEdison.setEtternavn("Edison");
        thomasEdison.setAlder(30);
        thomasEdison.setStudentId("4032");

        thomasEdison.skrivUtStudentInfo();
        System.out.println("StudentID: " + thomasEdison.getStudentId());
    }

}