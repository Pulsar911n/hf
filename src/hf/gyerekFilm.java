package hf;

public class gyerekFilm extends Film{
    private String tipus;
    public gyerekFilm(String a, int b, int c, String d, String e){
        super(a,b,c,d);
        tipus = e;
    }

    public String getTipus(){return tipus;}
    public void setTipus(String a){tipus = a;}
}
