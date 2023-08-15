package view;

import controller.RecursivaDivisão;

public class Principal {

	public static void main(String[] args) {
		RecursivaDivisão rd = new RecursivaDivisão();
		
		int resto = 51;
		int divisor = 4;
		
		int res = rd.divisão(resto, divisor);
		
		System.out.println(res);

	}

}
