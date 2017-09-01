package fr.codevalle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;




public class CalculatriceTest {


	Calculatrice calculatrice;
	
	@Before
	public void initialition() {
		calculatrice = new CalculatriceImpl();
	}
	
	@Test
		public void premierTest() throws Exception {
			assertEquals(1, 1);
		}
	
	@Test
	public void additionTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.addition(a, b);
		assertEquals(retour, 4.0, 0.0);
	}
	
	@Test
	public void multiplicationTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.multiplication(a, b);
		assertEquals(retour, 3.0, 0.0);
	}
	
	@Test
	public void soustractionTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.soustraction(a, b);
		assertEquals(retour, -2.0, 0.0);
	}
	
	@Test
	public void divisionTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.division(a, b);
		assertEquals(retour, 1/3.0 , 0.0);
	}
	
	@Test(expected = ArithmeticException.class)
	public void divisionParZeroTest() {
		double a = 1;
		double b = 0;
		double retour = calculatrice.division(a, b);
//		try {
//		double retour = calculatrice.division(a, b);
//		}catch(ArithmeticException e) {
//			System.out.println("division par zéro");
//		}
//		System.out.println(retour);
//		assertSame(retour, retour.isInfinite() , 0.0);
//		assertEquals("division infini", true, retour.isInfinite());
	}
	
	    
}
