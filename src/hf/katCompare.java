package hf;
import java.util.Comparator;
public class katCompare implements Comparator<Film>{
    public int compare(Film f1, Film f2){
        String kat1 = f1.getKategoria();
        String kat2 = f2.getKategoria();
        return kat1.compareTo(kat2);
    }
}
