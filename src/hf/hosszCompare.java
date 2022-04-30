package hf;
import java.util.Comparator;
public class hosszCompare implements Comparator<Film> {
    public int compare(Film f1, Film f2){
        int hossz1 = f1.getHosszPercben();
        int hossz2 = f2.getHosszPercben();
        if (hossz1>hossz2){
            return 1;
        }
        if (hossz1<hossz2){
            return -1;
        }else{
            return 0;
        }
    }
}
