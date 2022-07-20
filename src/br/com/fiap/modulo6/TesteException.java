package br.com.fiap.modulo6;

public class TesteException {
	public static void main(String[] args) {
		
		try {
			//trecho onde a exceção pode ocorrer
			int val = 10/0;
			System.out.println(val);
		
		}catch (Exception e) { //captura da exceção
			
			//tratamento da exceção
			e.printStackTrace();
		}
	}
}
