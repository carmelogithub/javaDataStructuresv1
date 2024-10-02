package teoria.vistas;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeraLista {

    public static void main(String[] args){
        ArrayList<Float> precios= new ArrayList<Float>();
        precios.add(23.9f);
        precios.add(20.5f);
        precios.add(54.85f);
        precios.add(40.5f);

        System.out.println(precios);
        precios.remove(23.9f);
        System.out.println(precios);

        precios.add(2,55.95f);
        System.out.println(precios);
        precios.addFirst(99.87f);
        System.out.println(precios);

        Iterator<Float> it= precios.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }//cierra main
}//cierra class
