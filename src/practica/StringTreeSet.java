package practica;
/*
Tienes 7 Strings
        No soporta duplicados (Set)
        mostrarlos ordenados (Set no ordenado)

        *TreeSet recoge un "orden natural"

 */

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
    public static void main(String[] args) {
        Set<String> palabras=new TreeSet();
        palabras.add("jugador");
        palabras.add("balon");
        palabras.add("arbitro");
        palabras.add("gol");
        palabras.add("portero");
        palabras.add("defensa");
        palabras.add("delantero");

        //no usamos sort porque TreeSet ya ordena "de modo natural"

        System.out.println(palabras);
        for (String palabra:palabras){
            System.out.println(palabra);
        }
    }//cierra main
}
