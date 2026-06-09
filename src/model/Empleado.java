package model;

public class Empleado extends Persona {
    // herencia atributos especificos de la subclase
    private String cargo;
    private double sueldo;

    // constructor usa super para traer los datos de persona
    public Empleado(String rut, String nombre, String correo, Direccion direccion, String cargo, double sueldo) {
        super(rut, nombre, correo, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // getters y setters acceso publico a los atributos
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    // salida combina el tostring base con los datos nuevos
    @Override
    public String toString() {
        return super.toString() + " | Cargo: " + cargo + " | Sueldo: $" + sueldo;
    }
}