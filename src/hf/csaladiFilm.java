package hf;

public class csaladiFilm extends Film{
    private int korhatar;
    public csaladiFilm(String a, int b, int c, String d, int e){
        super(a,b,c,d);
        korhatar = e;
    }
    public int getKorhatár(){return korhatar;}
    public void setKorhatár(int a){korhatar = a;}
}
