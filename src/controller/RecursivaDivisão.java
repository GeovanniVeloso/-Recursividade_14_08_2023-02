package controller;

public class RecursivaDivisão {
	public RecursivaDivisão () {
		super();
	}
	//Explicação: Recebe divisor e dividendo ( dividendo armazenado na variável resto ) e segue o subtraindo até que resto seja inferior ao dividendo.
	//Condição de parada definida por resto menor que divisor para impedir de a divisão se extenda.
	//Chamada da função definida por divisão(resto - divisor, divisor) dividido em duas linhas para melhor vizualização minha.
	public int divisão ( int resto, int divisor) {
		if ( resto < divisor) {
			return resto;
		}else {
			resto = resto - divisor;
			resto = divisão(resto, divisor);
		}
		return resto;
	}
}
