
package app;
import model.Calculadora;

public class Aplicacao{
	public static void main (String [] args){
		
		Calculadora soma = new Calculadora();
		System.out.println(soma.somar(2,2));
		
		Calculadora sub = new Calculadora();
		System.out.println(sub.subtrair(5,3));
		
		Calculadora mult = new Calculadora();
		System.out.println(mult.multiplicar(5,2));
		
		Calculadora div = new Calculadora();
		System.out.println(div.dividir(4,2));
	}
	
}