package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   SISTEMA DE GESTIÓN - LLANQUIHUE TOUR           ");
        System.out.println("==================================================\n");

        // composicion de datos se crea direcciones que iran dentro de persona
        Direccion dir1 = new Direccion("Av. Vicente Pérez Rosales", 450, "Llanquihue");
        Direccion dir2 = new Direccion("San Martín", 123, "Puerto Varas");
        Direccion dir3 = new Direccion("Los Alerces", 789, "Frutillar");

        // instancias donde se crea los objetos usando constructores
        Persona cliente = new Persona("20.123.456-7", "Carlos Mendoza", "carlos.mendoza@gmail.com", dir1);

        // herencia empleado que hereda de persona y agrega cargo con sueldo
        Empleado guia = new Empleado("18.987.654-3", "Andrea Villalobos", "andrea.v@llanquihuetour.cl", dir2, "Guía Turístico", 650000);
        Empleado admin = new Empleado("15.321.789-0", "Ricardo Espinoza", "r.espinoza@llanquihuetour.cl", dir3, "Administrador de Operaciones", 900000);

        // salida donde imprime los datos de los tres objetos usando tostring
        System.out.println("--- Registro de Clientes ---");
        System.out.println(cliente);
        System.out.println();

        System.out.println("--- Registro de Colaboradores / Empleados ---");
        System.out.println(guia);
        System.out.println(admin);

        System.out.println("\n==================================================");
    }
}