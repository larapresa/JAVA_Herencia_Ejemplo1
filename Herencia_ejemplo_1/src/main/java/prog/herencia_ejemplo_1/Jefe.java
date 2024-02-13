/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.herencia_ejemplo_1;

/**
 *
 * @author larapresa
 */
public class Jefe extends Empleado{
	private String departJefe;
	private String titulUniv;
	
        public Jefe(String nombre,float sueldo, String departJefe, String titulUniv){
		super(nombre, sueldo);
		this.departJefe=departJefe;
		this.titulUniv=titulUniv;		
	}
	
        
	public void setDepartJefe(String departJefe){		
		this.departJefe=departJefe;
	}
	
	public void setTitulUniv(String titulUniv){
		this.titulUniv=titulUniv;
	}
	
	
	public void imprimeDepartJefe(){
		System.out.print("\n\t\tES JEFE DEL DEPARTAMENTO:  " + departJefe);
	}
	public void imprimeTitulUniv(){
		System.out.print("\n\t\tTIENE COMO TITULO UNIVERSITARIO: " + titulUniv);
	}
	
	public void imprimeTodo(){
		super.imprimeTodo();
		imprimeDepartJefe();
		imprimeTitulUniv();
	}
}

