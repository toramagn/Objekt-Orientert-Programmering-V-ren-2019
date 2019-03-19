

public class kurs {

    private String navn;
    private String kode;
    private int studiePoeng;

    //konstruktoor, maa ha samme navn som klassen
    public kurs(String navn, String kode, int studiePoeng){
        this.navn = navn;
        this.kode = kode;
        this.studiePoeng = studiePoeng;
    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getStudiePoeng() {
        return studiePoeng;
    }
    public void setStudiePoeng(int studiePoeng) {
        this.studiePoeng = studiePoeng;
    }


}

