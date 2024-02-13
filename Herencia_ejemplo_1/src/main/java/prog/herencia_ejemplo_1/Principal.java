/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.herencia_ejemplo_1;

import java.util.Scanner;

/**
 *
 * @author larapresa
 */
public class Principal {

    public static void main(String[] args) {
        
        String nombre;
        float sueldo;
        String departJefe;
        String titulUniv;
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("Vamos a insertar los datos del empleado: ");
        System.out.println("NOMBRE ");
        nombre = teclado.nextLine();
        System.out.println("SUELDO ");
        sueldo = teclado.nextFloat();
        teclado.nextLine();
        Empleado emple = new Empleado(nombre, sueldo);

        System.out.println("Vamos a insertar los datos del jefe: ");
        nombre = teclado.nextLine();
        System.out.println("SUELDO ");
        sueldo = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("DEPARTAMENTO DEL QUE ES JEFE? ");
        departJefe = teclado.nextLine();
        System.out.println("TITULO UNIVERSITARIO? ");
        titulUniv = teclado.nextLine();
        Jefe jefe = new Jefe(nombre, sueldo, departJefe, titulUniv);

        System.out.println("\n\tVamos a mostrar los datos del empleado: ");
        emple.imprimeTodo();
        System.out.println("\n\tVamos a mostrar los datos del jefe: ");
        jefe.imprimeTodo();
    }
}
