/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.herencia_ejemplo_1;

/**
 *
 * @author larapresa
 */
public class Empleado {
	private String nombre;
	private float sueldo;
	
        public  Empleado(String nombre,float sueldo){
		this.nombre=nombre;
		this.sueldo=sueldo;
        }
	public void setNombre(String nombre){	
		this.nombre=nombre;
	}
	
	public void setSueldo(float sueldo){		
		this.sueldo=sueldo;
	}
	public void imprimeNombre(){
		System.out.print("\n\t\tNOMBRE " + nombre);
	}
	
	public void imprimeSueldo(){
		System.out.print("\n\t\tSUELDO " + sueldo);
	}
	public void imprimeTodo(){		
		imprimeNombre();
		imprimeSueldo();
	}
}
