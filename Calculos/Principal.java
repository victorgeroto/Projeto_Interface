package Calculos;

public class Principal {

	public static void main(String[] args) {
	
		Adicionar adicionar = new Adicionar();
		System.out.println("A soma é: "+adicionar.somar(10, 10));
		
		Subtrair subtrair = new Subtrair();
		System.out.println("A subtração é: "+subtrair.sub(15, 10));
		
		Calcular calcular = new Calcular();
		System.out.println("A multiplicação é: "+calcular.multi(10, 10));
		System.out.println("A Divisão é: "+calcular.div(10, 2));
		
		Expo exp = new Expo();
		System.out.println("O expoente é: "+exp.exp(2, 5));
		
	}
}
