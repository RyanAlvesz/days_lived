package br.senai.sp.jandira;

import java.util.Scanner;

public class DiasVividos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		
		int Idade = teclado.nextInt();
		int DiasVividos = Idade * 365;
		
		
		System.out.println("Você já viveu aproximadamente " + DiasVividos + " dias");

	}

}
