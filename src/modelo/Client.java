package modelo;

import java.util.Scanner;

import fantasia.FantasyFactory;
import infantil.InfantilFactory;
import terror.TerrorFactory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory factory =null;
		//
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		
		if(k.equals("infantil")) {
			factory =new InfantilFactory();
		}else if(k.equals("terror")) {
			factory =new TerrorFactory(); 
		}else if(k.equals("fantasia")){
			factory =new FantasyFactory();
		}else {
			System.out.println("Tipo de cuento no encontrado");
		}
		
		//
		Inicio i=factory.getInicio();
		Nudo n=factory.getNudo();
		Desenlace d=factory.getDesenlace();
		
		
		System.out.println(i.getTipo());
		System.out.println(n.getTipo());
		System.out.println(d.getTipo());
		
	}
}
