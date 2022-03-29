package Agenda;
import java.util.ArrayList;
import java.util.Scanner;
import Persona.Persona;

public class Agenda {
	private ArrayList<Persona> clientes;
	
	public Agenda() {
		clientes = new ArrayList<>();
	}
	
	public void agregarCliente(Scanner sc) {
		
		System.out.println("Ingrese el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el apellido: ");
		String apellido = sc.nextLine();
		System.out.println("Ingrese la edad: ");
		int edad = sc.nextInt();
		Persona nuevo= new Persona(nombre, apellido, edad);		
		clientes.add(nuevo);
	}
	
	 public void mostarLista() {
		for (int i=0; i< clientes.size(); i++) {
			System.out.println(clientes.get(i).getNombre()+" "+clientes.get(i).getApellido()+" "+clientes.get(i).getEdad());
		}
	 }
	
	
}
;