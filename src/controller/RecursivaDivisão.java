package controller;

public class RecursivaDivis�o {
	public RecursivaDivis�o () {
		super();
	}
	//Explica��o: Recebe divisor e dividendo ( dividendo armazenado na vari�vel resto ) e segue o subtraindo at� que resto seja inferior ao dividendo.
	//Condi��o de parada definida por resto menor que divisor para impedir de a divis�o se extenda.
	//Chamada da fun��o definida por divis�o(resto - divisor, divisor) dividido em duas linhas para melhor vizualiza��o minha.
	public int divis�o ( int resto, int divisor) {
		if ( resto < divisor) {
			return resto;
		}else {
			resto = resto - divisor;
			resto = divis�o(resto, divisor);
		}
		return resto;
	}
}
