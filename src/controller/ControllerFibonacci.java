/*5. Considere a série de Fibonacci:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

Escrever uma função recursiva que, dado uma posição da série, a função retorne seu valor.
Entrada limitada a 20 (Condição que deve ser testada na Main da aplicação).
• O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;*/
package controller;

public class ControllerFibonacci {
	
	public ControllerFibonacci() {
		super();
	}
	
	public int serieFibonacci(int numero) {
		
		if(numero == 0) {
			System.out.println("Valor inexistente na série Fibonacci.");
			return 0;//Se o numero for 0, não existe na serie Fibonacci.
		} else if(numero == 1 || numero == 2) {
			return 1;//Se numero for 1 ou 2, retorna 1 como valor na série.
		} else {
			return serieFibonacci(numero - 1) + serieFibonacci(numero - 2);//Senão, retorna a soma das recursivas dos 2 numeros anteriores. 
		}
	}
}