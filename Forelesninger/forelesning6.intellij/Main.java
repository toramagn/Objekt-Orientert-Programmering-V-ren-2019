package no.hiof.torama.figurarv;

public class Main{
    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(4, 5);

        Sirkel sirkelen = new Sirkel(6);

        Sirkel kvadratet = new Kvadrat(5);

        System.out.println(rektangelet + 
            " Areal: " + rektangelet.areal() +
            " Omrekts: " + rektangelet.omrekts());

        System.out.println(sirkelen + 
            " Areal: " + sirkelen.areal() + 
            " Omkrets: " + sirkelen.omrekts());

        System.out.println(kvadratet + 
        " Areal: " + kvadratet.areal() +
        " Omrekts: " + kvadratet.omrekts());

        if( erStorre(rektangelet, sirkelen) ){
            System.out.println("Rektangelet er størst.");
        }
        else{
            System.out.println("Sirkelen er størst.");
        }

        Rektangel rektangel2 = Kvadrat(18);
        System.out.println(rektangel2);

        System.out.println("\n*********Skriver ut array******");

        Figur[] figurArray= new Figur[4];

        figurArray[0] = rektangelet;
        figurArray[1] = sirkelen;
        figurArray[2] = kvadratet;
        figurArray[3] = rektangel2;

        for (int = 0; i < figurArray.length; i++){
            System.out.println(figurArray[i]);
        }

    }

    public static boolean erStorre(Figur figur1, Figur figur2) {
        return figur1.areal() > figur2.areal();
    }
}