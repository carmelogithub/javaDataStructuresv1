package practica;

/*
En el paquete práctica,crea un set para almacenar asignaturas
La asignatura indica nombre, créditos y docente.
Añade 4 asignaturas y te equivocas y añades una asignatura que ya tenías.
Muestra el listado en pantalla.
Aparece la asignatura dos veces?
 */

import practica.model.Asignatura;

import java.util.HashSet;
import java.util.Iterator;

public class SetAsignaturas {
    public static void main(String[] args )
    {
        HashSet<Asignatura> asignaturas = new HashSet<>();
        asignaturas.add(new Asignatura("Matemáticas", 6, "Juan"));
        asignaturas.add(new Asignatura("Lengua", 4, "María"));
        asignaturas.add(new Asignatura("Inglés", 4, "María"));
        asignaturas.add(new Asignatura("Física", 6, "Juan"));
        asignaturas.add(new Asignatura("Matemáticas", 6, "Juan"));

        Iterator<Asignatura> it = asignaturas.iterator();
        while (it.hasNext()) {
            Asignatura asignatura = it.next();
            System.out.println(asignatura.getNombre() + " " + asignatura.getCreditos() + " " + asignatura.getDocente());
        }
    }//cierra main
}//cierra clase
