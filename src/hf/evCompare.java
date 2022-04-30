package hf;
import java.util.Comparator;
public class evCompare implements Comparator<Film>{
    public int compare(Film f1, Film f2){
        int ev1 = f1.getKiadasEve();
        int ev2 = f2.getKiadasEve();
        if (ev1>ev2){
            return 1;
        }
        if (ev1<ev2){
            return -1;
        }else{
            return 0;
        }
    }
}
