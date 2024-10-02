package teoria.vistas;

import java.util.HashMap;
import java.util.Iterator;

public class PrimerMapa {
    public static void main(String[] args) {
        System.out.println("Manejar Mapa");

        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "lunes");
        mapa.put(2, "martes");
        mapa.put(3, "miércoles");
        mapa.put(4, "jueves");
        mapa.put(5, "viernes");

        System.out.println(mapa);
        Iterator<Integer> it = mapa.keySet().iterator();
        while (it.hasNext()) {
            Integer clave = it.next();
            System.out.println(clave + " " + mapa.get(clave));
        }
    }

}//cierra clase
