package debug;

public class Calculadora {

	
		public void soma(double valor1, double valor2) {
			var resultado = valor1 + valor2; //var s� pode ser declarado de forma local
			System.out.println("Total: " + resultado);
		}
		
		public double subtracao(double valor1, double valor2) {
			return valor1 + valor2;
		}
		
		public static void multiplicacao(double valor1, double valor2) {
			System.out.println("Resultado: " + valor1 * valor2);
		}
}
