public class main {

    public static void main(String[] args){

        byte alder = 23;
        short antallStudenter = 181;
        int antallAnsatte = 485;
        long jordensOmkrets = 400075000L;

        long rarSammenSetningAvTall = alder + antallAnsatte + antallStudenter + jordensOmkrets;

        System.out.println("Rart tall:" + rarSammenSetningAvTall);

        float timeLonn = 203.5F;
        double antallTimer = 2345.5;

        char gjennomsnittsKarakter = 'A';
        boolean obligGodkjent = true;

        String setning = "Try not. DO, or do not. There is no try.";
    
        double tall = (3.0 + 6.0) / 2.0;

        System.out.println("Tallverdi: " + ++tall);

        tall = tall + 5;

        tall += 5;

        System.out.println("Tallverdi: " + tall);

        int x = 5;
        int y = 20;

        x = y;

        System.out.println("X: " + x + "Y: " + y);
        y=10;
        System.out.println("X: " + x + "Y " + y);
    }

}