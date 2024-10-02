package practica.model;

public class Asignatura {
    private String nombre;
    private int creditos;
    private String docente;

    public Asignatura(String nombre, int creditos, String docente) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
}//cierra asignatura
