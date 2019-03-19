public class studieregistrering {

    public static void main(String[] args) {
        kurs mobilProgrammering = new kurs("Mobilprogrammering", "IT4821", 10);
        kurs kvanteFysikk = new kurs("Kvantefysikk", "KF3912", 20);

        String kursNavn = kvanteFysikk.getNavn();

        System.out.println("\nKursnavn: " + mobilProgrammering.getNavn());
        System.out.println("\nKursnavn: " + kursNavn);

    }
}