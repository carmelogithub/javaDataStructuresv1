package teoria.vistas;

import java.util.HashSet;
import java.util.Iterator;

public class PrimerSet {
    public static void main(String[] args) {
        System.out.println("Manejar Set");
        HashSet<String> set = new HashSet<>();
        set.add("Hola");
        set.add("Mundo");
        set.add("Hola");//repetido
        set.add("Mundo");
        set.add("Adiós");
        set.contains("Hola");
        System.out.println(set);
        Iterator<String> it = set.iterator();
while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
