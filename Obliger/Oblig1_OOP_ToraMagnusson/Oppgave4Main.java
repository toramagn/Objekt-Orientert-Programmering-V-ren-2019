import java.util.Scanner;
import java.util.ArrayList;

public class Oppgave4Main{

    private static ArrayList<Oppgave4> arrayPersoner = new ArrayList<Oppgave4>(); //Oppgave4 fordi det er klasse-navnet i den andre filen min
    public static void main(String[] args) {

    
        Oppgave4 person1 = new Oppgave4("Linus","Haraldsen",19);
        Oppgave4 person2 = new Oppgave4("Per","Hansen",43);
        Oppgave4 person3 = new Oppgave4("Ola","Nordmann",67);

        arrayPersoner.add(person1);
        arrayPersoner.add(person2);
        arrayPersoner.add(person3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn fornavn: ");
        String fornavn = scanner.nextLine();

        System.out.println("Skriv inn etternavn: ");
        String etternavn = scanner.nextLine();

        System.out.println("Skriv inn alder: ");
        int alder = scanner.nextInt();

        Oppgave4 person = new Oppgave4(fornavn, etternavn, alder);

        System.out.println("\nFornavn: " + person.getFornavn() + " Etternavn: " + person.getEtternavn() + ". Alder: " + person.getAlder());

        arrayPersoner.add(person);

        for (int i = 0; i < arrayPersoner.size(); i++){
            System.out.println("\nFornavn: " + arrayPersoner.get(i).getFornavn() + " Etternavn: " + arrayPersoner.get(i).getEtternavn() + ". Alder: " + arrayPersoner.get(i).getAlder());
        }

    }

}