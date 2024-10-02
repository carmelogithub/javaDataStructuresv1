package practica;

import practica.model.Producto;

import java.util.ArrayList;
import java.util.Iterator;

/*
En el paquete práctica,crea una lista para almacenar productos.
inserta 5 y los muestras en pantalla.
 */

public class ListaProductos {
    public static void main(String[] args){
        ArrayList<String> productos= new ArrayList<String>();
        productos.add("Leche");
        productos.add("Pan");
        productos.add("Huevos");
        productos.add("Azúcar");
        productos.add("Café");

        System.out.println(productos);
        Iterator<String> it= productos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }//cierra while
        ArrayList<Producto> productos2= new ArrayList<Producto>();
        productos2.add(new Producto("Leche", 2, 1.5f));
        productos2.add(new Producto("Pan", 1, 0.5f));
        productos2.add(new Producto("Huevos", 12, 3.5f));
        productos2.add(new Producto("Azúcar", 1, 1.0f));
        productos2.add(new Producto("Café", 1, 2.5f));
        System.out.println(productos2);
        Iterator<Producto> it2= productos2.iterator();
        while(it2.hasNext()){
            Producto p= it2.next();
            System.out.println(p.getNombre()+" "+p.getUnidades()+" "+p.getPrecio());
        }//cierra while

    }//cierra main
}
