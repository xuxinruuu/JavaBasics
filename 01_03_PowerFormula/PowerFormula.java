/*Calcula la potencia (power = force * distance / time)*/

public class PowerFormula {

	public static void main(String[] args) {
		double force = 125;
		double distance = 37;
		double time = 12;
	
		double power = force * distance / time;
		System.out.println( "Power = " + power + " W");		 
	}
}