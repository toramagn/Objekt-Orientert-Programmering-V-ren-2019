import java.util.Scanner;

public class Oppgave2 { /*endret filnavnet fra "Oppgave.java" til "Oppgave2.java", 
                        da maatte jeg ogsaa endre "public class Oppgave" til "public class Oppgave2" */

    public static void main(String[] args) {
        // Oppretter og instansierer et objekt av typen Scanner
        Scanner scanner = new Scanner(System.in);

        // Printer ut til konsollen
        System.out.println("Skriv inn fornavn: ");
        // Leser input fra konsollen
        String fornavn = scanner.nextLine();


        // Printer ut til konsollen
        System.out.println("Skriv inn etternavn: ");
        // Leser input fra konsollen
        String etternavn = scanner.nextLine();

        // Printer ut til konsollen
        System.out.println("Skriv inn alder: ");
        // Leser input fra konsollen
        int alder = scanner.nextInt(); //bruker int her siden alder er et tall.

        System.out.println("\nDitt navn er: " + fornavn + " " + etternavn + "\nDin alder er: " + alder);
    }

}

public class Oppgave3 {

    public static void main(String[] args) {

        Person person[] = new person(fornavn,etternavn,alder);

        String person[] = person.nextLine();

        System.out.println("\n"person[]);

    }

}