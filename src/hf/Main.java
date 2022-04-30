package hf;
import java.sql.Time;
import  java.util.ArrayList;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.io.FileWriter;
public class Main {

    static private ArrayList<Film> filmek = new ArrayList<>();
    static List listaz = new List();
    public static void main(String[] args) {

        Film alapSima = new Film("Sima film cime",2016,160,"sima");
        Film alapDokumentum = new dokumentumFilm("Dokumentum film cime",2010,120,"dokumentum","Alap dokumentum film leirása");
        Film alapCsaladi = new csaladiFilm("Csaladi film cime",2020,90,"csaladi", 12);
        Film alapGyerek = new gyerekFilm("Gyerek film cime",2004,80,"gyerek","animációs");

        filmek.add(alapSima);
        filmek.add(alapDokumentum);
        filmek.add(alapCsaladi);
        filmek.add(alapGyerek);

        startMenu();
    }
    public static void fajlbaIras(String a){
        try{
            FileWriter f1 = new FileWriter(a);
            for (Film i: filmek){
                f1.write(i.toString()+"\n"+""+"\n");
                System.out.println("\tSikeresen beirtuk a(z) -" + i.getCim() + "- filmet!");
                //i.getCim()+";"+i.getKiadasEve()+";"+i.getHosszPercben()+";"+i.getKategoria()+"\n"
            }
            f1.close();
        }catch (IOException e){
            System.err.println("\tHiba a fájl elérésekor." + e);
        }

    }
    public static void fajlBeolvasas(String a){
        try{
            File userFile = new File(a);
            Scanner s1 = new Scanner(userFile);
            while (s1.hasNextLine()){
                String sor = s1.nextLine();
                String[] adatok = sor.split(";");
                System.out.println("Adat hozzáadása...");
                if (adatok[3].equals("csaladi")){
                    filmek.add(new csaladiFilm(adatok[0],Integer.parseInt(adatok[1]),Integer.parseInt(adatok[2]),adatok[3],Integer.parseInt(adatok[4])));
                }
                else if (adatok[3].equals("dokumentum")){
                    filmek.add(new dokumentumFilm(adatok[0],Integer.parseInt(adatok[1]),Integer.parseInt(adatok[2]),adatok[3],adatok[4]));
                }
                else if (adatok[3].equals("gyerek")){
                    filmek.add(new dokumentumFilm(adatok[0],Integer.parseInt(adatok[1]),Integer.parseInt(adatok[2]),adatok[3],adatok[4]));
                }
                else{
                    filmek.add(new Film(adatok[0], Integer.parseInt(adatok[1]), Integer.parseInt(adatok[2]), adatok[3]));
                }
                System.out.println("\t\t...sikeres");
            }
        }catch (FileNotFoundException e){
            System.err.println("\tNincs ilyen fájl!");
        }


    }
    public static void keziBeolvasas(){
        try {
            System.out.print(" -- Adja meg a film cimét,kiadásának évét, a film hosszát percben és hogy milyen kategóriába tartozik!\n !!Az adatokat ;-al elválasztva adja meg, szóköz nélkül!!\n:");
            Scanner s1 = new Scanner(System.in);
            String[] adatok = s1.nextLine().split(";");
            if (adatok[3].equals("csaladi")){
                System.out.print("Családi filmek esetén meg kell adnia egy korhatárt is!\n:");
                Scanner olvaso1 = new Scanner(System.in);
                int korhatar = Integer.parseInt(olvaso1.nextLine());
                filmek.add(new csaladiFilm(adatok[0],Integer.parseInt(adatok[1]),Integer.parseInt(adatok[2]),adatok[3],korhatar));
                System.out.println("Adatok hozzáadása...");
            }
            else if (adatok[3].equals("dokumentum")){
                System.out.print("A dokumentumfilmekhez tartozik egy rövid leirás is!\n:");
                Scanner olvaso2 = new Scanner(System.in);
                String leiras = olvaso2.nextLine();
                filmek.add(new dokumentumFilm(adatok[0],Integer.parseInt(adatok[1]),Integer.parseInt(adatok[2]),adatok[3],leiras));
                System.out.println("Adatok hozzáadása...");
            }
            else if (adatok[3].equals("gyerek")){
                System.out.print("Gyerek filmek esetén meg kell adni egy tipust is!(Animációs vagy élőszereplős, stb.)\n:");
                Scanner olvaso3 = new Scanner(System.in);
                String tipus = olvaso3.nextLine();
                filmek.add(new gyerekFilm(adatok[0],Integer.parseInt(adatok[1]),Integer.parseInt(adatok[2]),adatok[3],tipus));
                System.out.println("Adatok hozzáadása...");
            }
            else {
                System.out.println("Adatok hozzáadása...");
                filmek.add(new Film(adatok[0], Integer.parseInt(adatok[1]), Integer.parseInt(adatok[2]), adatok[3]));
            }

            System.out.println("\t\t...sikeresen hozzáadva");
        }catch (Exception e){
            System.err.println("\tHiba lépett fel az adatok hozzáadaása közben, visszaléptettük a kezdőképernyőre");
        }


    }
    public static void startMenu(){
        System.out.println("\t\t $ Filmadatbázis $");
        System.out.println(" ** A különböző parancsokat a nevük utáni számokat begépelve érhetjük el **\n ** Az 1-es választás után vesszővel elválasztva meghadhatja, hogy mi alapján szeretné rendezni a listát(cim, kiadas eve, hossz, kategoria) **\n ** Ha üresen hagyja nem lesz rendezve **");
        while (true) {
            System.out.println(" -- Opciók:\n\t × Filmek megtekintése(1)\n\t × Film hozzáadása(2)\n\t × Adatok kiirása fájlba(3)\n\t × Kilépés(4)");
            Scanner s1 = new Scanner(System.in);
            String[] alapValasztas = s1.nextLine().split(",");
            if (alapValasztas[0].equals("1")) {
                if (alapValasztas.length<=1){
                    listaz.kilistaz(filmek);
                }
                else{
                    if (alapValasztas[1].equals("cim")){
                        Collections.sort(filmek, new cimCompare());
                        listaz.kilistaz(filmek);
                    }
                    if (alapValasztas[1].equals("kiadas eve")){
                        Collections.sort(filmek, new evCompare());
                        listaz.kilistaz(filmek);
                    }
                    if (alapValasztas[1].equals("hossz")){
                        Collections.sort(filmek, new hosszCompare());
                        listaz.kilistaz(filmek);
                    }
                    if (alapValasztas[1].equals("kategoria")){
                        Collections.sort(filmek, new katCompare());
                        listaz.kilistaz(filmek);
                    }

                }


            }
            if (alapValasztas[0].equals("2")) {
                System.out.println(" -- Opciók:\n\t × Beolvasás kézzel(1)\n\t × Beolvasás fájlból(2)");
                Scanner s2 = new Scanner(System.in);
                String beolvasValasztas = s2.nextLine();
                if (beolvasValasztas.equals("1")) {
                    keziBeolvasas();
                }
                if (beolvasValasztas.equals("2")) {
                    try {
                        System.out.print(" -- Kérem a fájl nevét, kiterjesztéssel együtt!\n: ");
                        Scanner s3 = new Scanner(System.in);
                        String fajneve = s3.nextLine();
                        fajlBeolvasas(fajneve);
                    }catch (Exception e){
                        System.err.println("\tHiba lépett fel a fájl beolvasásakor.");
                    }
                }
            }
            if(alapValasztas[0].equals("3")){
                try{
                    System.out.print("Mi legyen a fájl neve?\n:");
                    Scanner s3 = new Scanner(System.in);
                    String fajnev = s3.nextLine();
                    fajlbaIras(fajnev);
                }catch (Exception e){
                    System.err.println("Érvénytelen fájlnév.");
                }

            }
            if (alapValasztas[0].equals("4")) {
                break;
            }
        }

    }
}


