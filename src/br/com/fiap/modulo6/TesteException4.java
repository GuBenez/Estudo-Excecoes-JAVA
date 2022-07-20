package br.com.fiap.modulo6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteException4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			// Lê os dois números
			System.out.println("Insira o primeiro número: ");
			int numero1 = sc.nextInt();
			System.out.println("Insira o segundo número: ");
			int numero2 = sc.nextInt();
			
			// Realiza a divisão
			int divisao = numero1 / numero2;
			
			// Exibe o resultado
			System.out.println("O resultado é: " + divisao);
		
		} catch (ArithmeticException e) {
			System.err.println("Erro ao dividir por zero!");
		} catch (InputMismatchException e) {
			System.err.println("Erro de entrada de dados!");
		} finally{
			System.out.println("Finalizando a execução do programa!");
			sc.close();
	}
		
		
	}
}
