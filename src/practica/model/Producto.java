package practica.model;

public class Producto {
    private String nombre;
    private int unidades;
    private float precio;

    public Producto(String nombre, int unidades, float precio) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
