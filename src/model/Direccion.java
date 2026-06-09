package model;

public class Direccion {
    // encapsulamiento atributos privados protegidos
    private String calle;
    private int numero;
    private String comuna;

    // constructor inicializa todos los atributos
    public Direccion(String calle, int numero, String comuna) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
    }

    // getters y setters metodos publicos de acceso
    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

    // salida retorno de texto legible con los datos
    @Override
    public String toString() {
        return calle + " #" + numero + ", " + comuna;
    }
}