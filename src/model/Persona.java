package model;

public class Persona {
    // encapsulamiento atributos privados del objeto
    private String rut;
    private String nombre;
    private String correo;
    private Direccion direccion; // composicion relacion con la otra clase

    // constructor inicializa todos los datos
    public Persona(String rut, String nombre, String correo, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    // getters y setters metodos de acceso publico
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    // salida muestra los datos en texto ordenado
    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Correo: " + correo + " | Dirección: [" + direccion + "]";
    }
}