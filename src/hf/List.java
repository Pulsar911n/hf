package hf;

import java.util.ArrayList;

public class List {
    public void kilistaz(ArrayList<Film> a){
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
            System.out.println("");
        }
    }
}
