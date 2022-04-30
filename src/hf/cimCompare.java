package hf;
import java.util.Comparator;
public class cimCompare implements Comparator<Film>{
    public int compare(Film f1, Film f2){
        String cim1 = f1.getCim();
        String cim2 = f2.getCim();
        return cim1.compareTo(cim2);
    }
}
