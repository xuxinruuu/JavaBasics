import java.util.Scanner;

public class CovidTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tens febre? (sí/no): ");
        String febre = sc.nextLine().toLowerCase();

    //SI febre
        if ( febre.equalsIgnoreCase("si") || febre.equalsIgnoreCase("sí") ){

            System.out.println("També tens tos? (sí/no):");
            String tos = sc.nextLine().toLowerCase();

        // SI febre, SI tos
            if ( tos.equalsIgnoreCase("si") || tos.equalsIgnoreCase("sí") ) {
                
                System.out.println("Et sents cansat o dèbil? (sí/no):");
                String cansat = sc.nextLine().toLowerCase();

            // 1. SI febre, SI tos, SI cansat
                if (cansat.equalsIgnoreCase("si") || cansat.equalsIgnoreCase("sí") ) {
                    System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");

            // SI febre, SI tos, NO cansat
                }else if( cansat.equalsIgnoreCase("no") ){
                    System.out.println("Tens dificultat per respirar? (sí/no):");
                    String respirar = sc.nextLine().toLowerCase();

                // 2. SI febre, SI tos, NO cansat, SI dificultat respiratoria
                    if (respirar.equalsIgnoreCase("si") || respirar.equalsIgnoreCase("sí") ) {
                        System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");

                // 3. SI febre, SI tos, NO cansat, NO dificultat respiratoria
                    }else if( respirar.equalsIgnoreCase("no") ){
                        System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
                    }
                }

        // SI febre, NO tos
            } else if ( tos.equalsIgnoreCase("no") ){
                System.out.println("Tens mal de coll o mal de cap? (sí/no):");
                String malDeCap = sc.nextLine().toLowerCase();

            // 4. SI febre, NO tos, SI mal de cap/coll
                if (malDeCap.equalsIgnoreCase("si") || malDeCap.equalsIgnoreCase("sí") ) {
                    System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");

            // 5. SI febre, NO tos, NO mal de cap/coll
                } else if ( malDeCap.equalsIgnoreCase("no") ){
                    System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
                }

            }

    // NO febre 
        }else if ( febre.equalsIgnoreCase("no") ){
            System.out.println("Has perdut l'olfacte o el gust? (sí/no):");
            String perduaGust = sc.nextLine().toLowerCase();

        // 6. NO febre, SI perduaGust
            if (perduaGust.equalsIgnoreCase("si") || perduaGust.equalsIgnoreCase("sí") ) {
                System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");

        // NO febre, NO perduaGust
            } else if ( perduaGust.equalsIgnoreCase("no") ){
                System.out.println("Tens congestió nasal o mocs? (sí/no):");
                String congestio = sc.nextLine().toLowerCase();
            
            // 7. NO febre, NO perduaGust, SI congestio
                if (congestio.equalsIgnoreCase("si") || congestio.equalsIgnoreCase("sí") ) {
                    System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");

            // 8. NO febre, NO perduaGust, NO congestio
                } else if ( congestio.equalsIgnoreCase("no") ){
                    System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
                }
            }

        }
        sc.close();
    }
}
