package exe2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner vi = new Scanner(System.in);
		
			Paciente p1 = new Paciente("Victor", 67, 1.74, 45, 18);
			
			System.out.println("seu nome é: " + p1.nome);
			System.out.println("seu peso é:  " + p1.peso);
			System.out.println("sua altura é:  " + p1.altura);
			System.out.println("seu quadril é:  " + p1.quadril);
			System.out.println("sua idade é:   " + p1.idade);
			System.out.println("Seu IMC é:  " + Math.round(p1.calculeIMC()));
		
			
			
			


	}

}