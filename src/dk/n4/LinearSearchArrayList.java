package dk.n4;
import java.util.ArrayList;

/**
 * SEARCH ALGORITHM (WITH ARRAYLIST)
 *
 * Denne klasse demonstrerer en lineær søgealgoritme med "ArrayList". Ved hjælp af klassens egen metode "indexOf()"
 * kan vi få at vide på hvilket index tallet, vi søger efter, befinder sig.
 *
 * @author Daniel Lyck.
 * @since 30-11-2017
 */

public class LinearSearchArrayList {

    public static void main(String[] args) {

        //Erklærer og initialiserer en liste i "ArrayList", der kan håndtere heltal
        ArrayList<Integer> talArray = new ArrayList<>();

        //Tilføjer tal til listen
        talArray.add(2);
        talArray.add(43);
        talArray.add(21);
        talArray.add(9);
        talArray.add(4);
        talArray.add(32);
        talArray.add(201);
        talArray.add(5);
        talArray.add(9);
        talArray.add(11);

        /**
         * For at finde ud af, hvor tallet befinder sig, så anvender vi metoden "indexOf()"
         * Angiv tallet, du leder efter, som argument i metoden, og du får meddelt hvilket index, det befinder sig på.
         */
        System.out.println("Tallet, du leder efter, er placeret på index " + talArray.indexOf(5) + " i arrayet.");

    }

}
