package hf;
import  java.util.ArrayList;
import java.io.File;
import java.util.Collections;
import java.io.FileNotFoundException;
public class Main {

    static ArrayList<Film> filmek = new ArrayList<>();
    public static void listFilmsAlap(){
        for (Film i: filmek){
            System.out.println("Film cime: " + i.getCim() + "\nKiadásának éve: " + i.getKiadasEve()+"\nHossza(percben): " + i.getHosszPercben()+"\nKategoriája: " + i.getKategoria());
            System.out.println("");
        }
    }
    public static void main(String[] args) {

        Film alapSima = new Film("Sima film cime",2016,160,"sima");
        Film alapDokumentum = new dokumentumFilm("Dokumentum film cime",2010,120,"dokumentum","Alap dokumentum film leirása");
        Film alapCsaladi = new csaladiFilm("Csaladi film cime",2020,90,"csaladi", 12);
        Film alapGyerek = new gyerekFilm("Gyerek film cime",2004,80,"gyerek","animációs");

        filmek.add(alapSima);
        filmek.add(alapDokumentum);
        filmek.add(alapCsaladi);
        filmek.add(alapGyerek);

        listFilmsAlap();
    }
}
