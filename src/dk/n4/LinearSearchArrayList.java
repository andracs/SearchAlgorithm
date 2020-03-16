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
    
    //Erklærer og initialiserer en liste i "ArrayList", der kan håndtere heltal
    ArrayList<Integer> talArray = new ArrayList<>();

    public static void main(String[] args) {
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
        
        search(4);
        
    }
    public static String search(int x) {

        // String resultat = "Tallet, du leder efter, er placeret på index " + talArray.indexOf(x) + " i arrayet.";
        
        for (int i = 0; i<talArray.size(); i++) {
            if (talArray.get(i)==x) {
                return "Tallet, du leder efter, er placeret på index " + i + " i arraylisten.";
            }
        }
        
        return "Der er ikke fundet " + x;
    
    }

}
