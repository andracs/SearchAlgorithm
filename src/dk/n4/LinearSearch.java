package dk.n4;

/**
 * SEARCH ALGORITHM
 *
 * Denne klasse demonstrerer en lineær søgealgoritme. Ved hjælp af et for-loop med et indlejret if-statement kan vi
 * søge efter et specifikt tal i et array, og få besked, når algoritmefunktionen finder tallet - samt meddelelse om
 * hvilket index, det er fundet i.
 *
 * @author Daniel Lyck.
 * @since 30-11-2017
 */

public class LinearSearch {

    public static void main(String[] args) {

        //Erklærer og initialiserer mit array samt variable med det tal, der ledes efter
        int[] talArray = {2, 43, 21, 9, 4, 32, 201, 5, 9, 11};
        int tallet = 4;

        //Selve søgealgoritmen - bygget op omkring et for-loop med en indlejret else/if
        for(int i = 0; i<talArray.length; i++) {

            if(tallet == talArray[i]) {
                System.out.println("Tallet 4 er fundet på index " + i); //Giver besked i konsollen
                break;
            } else System.out.println("Tallet er IKKE fundet på index " + i); //Giver besked i konsollen

        }

    }

}