package practica;

/*
Tenemos DAM - DAW - ASIR

DAM - Programación - Acceso a datos - Sistema de gestión empresarial
DAW- Programación - Despliegue de aplicaciones web - desarrollo web en entorno cliente
ASIR - Seguridad informática - Implatanción de aplicaciones web - administración de bases de datos

Almacenar esta info.
por consola preguntas el curso que quieres.
Muestra sus asignaturas.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AsignaturasFP {
    public static void main(String[] args){
        //grafo con Map
        Map<String, List<String>> asignaturas = new HashMap<>();
        asignaturas.put("DAM", List.of("Programación", "Acceso a datos", "Sistema de gestión empresarial"));
        asignaturas.put("DAW", List.of("Programación", "Despliegue de aplicaciones web", "Desarrollo web en entorno cliente"));
        asignaturas.put("ASIR", List.of("Seguridad informática", "Implantación de aplicaciones web", "Administración de bases de datos"));

        Scanner sc= new Scanner(System.in);
    System.out.println("Introduce el curso que quieres consultar: DAM / DAW / ASIR");
    String curso= sc.nextLine();
    List<String> listaAsignaturas= asignaturas.get(curso); //filtro de tipo where
    if(listaAsignaturas==null){
        System.out.println("No existe el curso");
    }else{
        System.out.println("Asignaturas del curso " + curso);
        for(String asignatura: listaAsignaturas){
            System.out.println(asignatura);
        }
    }

    }//cierra main
}//cierra clase









