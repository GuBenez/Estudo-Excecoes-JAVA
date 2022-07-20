package br.com.fiap.modulo6;

import java.util.Scanner;

public class TesteException3 {
	public static void main(String[] args) {
		
		//metodo de entrada de dados
		Scanner sc = new Scanner(System.in);
		
		
		//lê dois numeros
		System.out.println("Insira o primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.println("Insira o segundo número: ");
		int numero2 = sc.nextInt();
		
		try {
		//realiza a divisão
		int divisao = numero1/numero2;
		
		//exibe o resultado
		System.out.println("O resultado é: " + divisao);
		
		}catch (ArithmeticException e) {
			System.out.println("Erro ao dividir por zero!");
			sc.close();
		}
	}
} 
