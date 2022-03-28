package Persona;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	//constructores
		public Persona() {}
		public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre; 
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return this.apellido;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	
	
	public void getDatos() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		this.nombre = sc.nextLine();
		System.out.println("Ingrese apellido: ");
		this.apellido = sc.nextLine();
		System.out.println("Ingrese su edad: ");
		this.edad = sc.nextInt();
		sc.next();
		sc.close();
	}
}
