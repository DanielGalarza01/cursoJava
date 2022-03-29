package Paquete;
import java.util.Scanner;
import Agenda.Agenda;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		String ok;
		do {
			agenda.agregarCliente();
			System.out.println("Desea seguir cargando clientes? 'si' o 'no'");
			ok = sc.next();
		}while(ok.toLowerCase().equals("si"));
		
		sc.close();
		
		System.out.println("\nLista de clientes:\n");
		agenda.mostarLista();		
	}

}
