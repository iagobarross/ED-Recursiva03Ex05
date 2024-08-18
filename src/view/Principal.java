package view;

import java.util.Scanner;

import controller.ControllerFibonacci;

public class Principal {

	public static void main(String[] args) {
		ControllerFibonacci contFib = new ControllerFibonacci();
		Scanner sc = new Scanner(System.in);
		int numero = 21;
		
		while(numero > 20 || numero < 0) {
			numero = sc.nextInt();
		}
		
		int fib = contFib.serieFibonacci(numero);
		System.out.println("A posição " + numero + " na série de Fibonacci é: " + fib);
		sc.close();
	}

}
