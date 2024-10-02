package practica;

/*
En el paquete práctica, en una mapa almacenas la facturación de enero a junio.
añades el nombre del mes y la facturación
muestra la facturación por pantalla.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapaFacturacion {

    public static void main(String [] args){
        Map<String,Double> facturacion = new HashMap<>();
        facturacion.put("Enero", 547852.36);
        facturacion.put("Febrero", 1256.25);
        facturacion.put("Marzo", 4582.95);
        facturacion.put("Abril", 7825.36);
        facturacion.put("Mayo", 6541.25);
        facturacion.put("Junio", 78125.65);

        System.out.println(facturacion);
        System.out.println("Facturación sin ordenar -----------------------------------------");
        Iterator<String> it = facturacion.keySet().iterator();
        while (it.hasNext()){
            String clave = it.next();
            System.out.println(clave + " " + facturacion.get(clave));
        }
        System.out.println("Facturación ordenada ----------------------------------");
        facturacion.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);//programación funcional
        //facturacion.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        //reversed revisar


    }//cierra main
}//cierra clase
