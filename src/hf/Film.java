package hf;

public class Film {
    private String cim;
    private int kiadasEve;
    private int hosszPercben;
    private String kategoria;

    public Film(String cime, int kiadas, int hossz, String d){
        cim = cime;
        kiadasEve = kiadas;
        hosszPercben = hossz;
        kategoria = d;
    }

    public String getCim(){return cim;}
    public int getKiadasEve(){return kiadasEve;}
    public int getHosszPercben(){return hosszPercben;}
    public String getKategoria(){return kategoria;}
}
