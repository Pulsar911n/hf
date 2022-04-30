package hf;

public class dokumentumFilm extends Film{
    private String leiras;
    public dokumentumFilm(String a, int b, int c, String d, String e){
        super(a,b,c,d);
        leiras = e;
    }
    public void setLeiras(String a){ leiras = a;}
    public String getLeiras(){return leiras;}
    public String toString(){
        return super.toString() + "\n\tLeirasa: "+leiras;
    }
}
