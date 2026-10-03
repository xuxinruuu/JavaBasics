/*Parking gratuït:
  --  <=60min de dilluns a divendres
  --  membres && >= 65 anys
  --  dissabte i diumenge: membres <=120min 
*/

public class ParkingGratis {

	public static void main(String[] args) {

		boolean gratis = false;
		
		
		float minutes = 65;
		int age = 67;
		boolean weekEnd = true;
		boolean member = false;

		gratis = minutes <= 60 && !weekEnd || member && age >= 65 || member && weekEnd && minutes <= 120;		
		System.out.println("result = " + ( gratis == false ));
		
		minutes = 36;
		age = 65;
		weekEnd = false;
		member = true;
		
		gratis = minutes <= 60 && !weekEnd || member && age >= 65 || member && weekEnd && minutes <= 120;		
		System.out.println("result = " + ( gratis == true ));
		
		minutes = 115;
		age = 34;
		weekEnd = false;
		member = true;
		
		gratis = minutes <= 60 && !weekEnd || member && age >= 65 || member && weekEnd && minutes <= 120;		
		System.out.println("result = " + ( gratis == false ));
		
		minutes = 120;
		age = 34;
		weekEnd = true;
		member = true;
		
		gratis = minutes <= 60 && !weekEnd || member && age >= 65 || member && weekEnd && minutes <= 120;		
		System.out.println("result = " + ( gratis == true ));
		
		minutes = 130;
		age = 25;
		weekEnd = false;
		member = false;
		
		gratis = minutes <= 60 && !weekEnd || member && age >= 65 || member && weekEnd && minutes <= 120;		
		System.out.println("result = " + ( gratis == false ));
		
	}

}