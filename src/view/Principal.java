package view;

import controller.RecursivaDivis�o;

public class Principal {

	public static void main(String[] args) {
		RecursivaDivis�o rd = new RecursivaDivis�o();
		
		int resto = 51;
		int divisor = 4;
		
		int res = rd.divis�o(resto, divisor);
		
		System.out.println(res);

	}

}
