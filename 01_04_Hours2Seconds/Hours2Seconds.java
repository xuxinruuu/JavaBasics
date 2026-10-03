/*Convertir hores a segons*/

public class Hours2Seconds{

	public static void main(String[] args) {
		int hours = 12;
		int seconds = hours * 60 * 60;
		System.out.println( hours + " hours are " + seconds + " seconds" );

        hours = 15;
		seconds = hours * 60 * 60;
		System.out.println( hours + " hours are " + seconds + " seconds" );

		hours = 23;
		seconds = hours * 60 * 60;
		System.out.println( hours + " hours are " + seconds + " seconds" );

    }

}