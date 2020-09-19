package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.Calculadora;

public class CalculadoraTest{
	
	@Test 
	public void somarTest(){
		Calculadora soma = new Calculadora();
		int resultado = soma.somar(3,4);
		assertEquals(70, resultado);
	}
	@Test 
	public void somarTestNegativo(){
		Calculadora soma = new Calculadora();
		int resultado = soma.somar(-2,-8);
		assertEquals(-100, resultado);
	}
		
	@Test 
	public void subtrairTest(){
		Calculadora sub = new Calculadora();
		int resultado = sub.subtrair(3,1);
		assertEquals(20, resultado);
	}
	@Test 
	public void subtrairTestNegativo(){
		Calculadora sub = new Calculadora();
		int resultado = sub.subtrair(-8,4);
		assertEquals(-120, resultado);
	}
	
	@Test 
	public void multiplicarTest(){
		Calculadora mult = new Calculadora();
		int resultado = mult.multiplicar(5,4);
		assertEquals(200, resultado);
	}
	@Test 
	public void multiplicarTestZero(){
		Calculadora mult = new Calculadora();
		int resultado = mult.multiplicar(10,0);
		assertEquals(90, resultado);
	}
	@Test 
	public void dividirTest(){
		Calculadora div = new Calculadora();
		int resultado = div.dividir(20,4);
		assertEquals(50, resultado);
	}
	@Test 
	public void dividirTestNegativo(){
		Calculadora div = new Calculadora();
		int resultado = div.dividir(20,-5);
		assertEquals(-40, resultado);
	}
	
}