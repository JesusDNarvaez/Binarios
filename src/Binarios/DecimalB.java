package Binarios;

public class DecimalB extends Resultado {
	
	public void opDB (int a) {
	
		int modulo;
		String c = "";
		
		while(a>0) {
			
			modulo = (a%2);
			
			c=modulo+c;
			
			a=a/2;
		}
		
		super.setresultado(c);
	}
	
}
