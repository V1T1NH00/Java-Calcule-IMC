package exe2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner vi = new Scanner(System.in);
		
			Paciente p1 = new Paciente("Victor", 67, 1.74, 45, 18);
			
			System.out.println("seu nome �: " + p1.nome);
			System.out.println("seu peso �:  " + p1.peso);
			System.out.println("sua altura �:  " + p1.altura);
			System.out.println("seu quadril �:  " + p1.quadril);
			System.out.println("sua idade �:   " + p1.idade);
			System.out.println("Seu IMC �:  " + Math.round(p1.calculeIMC()));
		
			
			
			


	}

}