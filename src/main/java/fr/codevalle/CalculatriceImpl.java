package fr.codevalle;


public class CalculatriceImpl implements Calculatrice {

	
	public double addition(double a, double b) {
			return a+b;
		}  
	
	public static void main(String[] args) {
		
	}

	public double multiplication(double a, double b) {
		return a*b;
	}

	public double soustraction(double a, double b) {
		return a-b;
	}

	public double division(double a, double b) {
		if (b==0){
			throw new ArithmeticException();
		}
		return a/b;
	}
	 
	    
}
