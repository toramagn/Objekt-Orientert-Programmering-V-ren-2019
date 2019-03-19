package no.hiof.torama.dyrepark;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        //Dyr etDyr = new Dyr(); - ikke lov

        HonningGrevling nils = new HonningGrevling("Nils",
                LocalDate.of(2013, 3, 13));
        HonningGrevling peder = new HonningGrevling("Peder", LocalDate.of(2013, 3, 13));
        Sjimpanse arne = new Sjimpanse("Arne",
                LocalDate.of(2012, 4, 12), 60);

        System.out.println(nils);
        System.out.println(arne);

        nils.harDreptEnSlangeTil();
        nils.harDreptEnSlangeTil();
        nils.harDreptEnSlangeTil();
        nils.harDreptEnSlangeTil();
        nils.harDreptEnSlangeTil();
        nils.harDreptEnSlangeTil();

        peder.harDreptEnSlangeTil();
        peder.harDreptEnSlangeTil();
        peder.harDreptEnSlangeTil();

        Dyrepark dyrepark = new Dyrepark("Kristiansand");

        dyrepark.leggTilEtDyr(nils);
        dyrepark.leggTilEtDyr(arne);
        dyrepark.leggTilEtDyr(peder);

        ArrayList<Dyr> dyrIParken = dyrepark.getDyreListe();

        System.out.println("******USORTERT******");
        for(Dyr etDyr : dyrIParken){
            System.out.println(etDyr);
        }

        System.out.println("******SORTERT******");
        Collections.sort(dyrIParken);
        for(Dyr etDyr : dyrIParken){
            System.out.println(etDyr);
        }
    }
}
