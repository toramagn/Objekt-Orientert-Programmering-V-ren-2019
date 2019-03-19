package no.hiof.torama.dyrepark;

import java.time.LocalDate;

public class HonningGrevling extends Dyr {
    //instansvariabel
    private int antallSlangerDrept;
    //klassevariabel / konstant variabel
    private static final int MAX_ANTALL_SLANGER_DREPT = 5;

    public HonningGrevling(String navn, LocalDate fodselsdato) {
        super(navn, fodselsdato);
        antallSlangerDrept = 0;
    }

    public void harDreptEnSlangeTil() {
        if(antallSlangerDrept < MAX_ANTALL_SLANGER_DREPT){
            antallSlangerDrept++;
        }
        else{
            System.out.println(super.getNavn() + " har drept for mange slanger og må avlives.");
        }
    }

    public int getAntallSlangerDrept() {
        return antallSlangerDrept;
    }
}
