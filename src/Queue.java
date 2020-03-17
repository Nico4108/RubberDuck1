import java.util.ArrayList;
import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {

        //Scanner til at skrive input til starent af køen
        Scanner scn = new Scanner(System.in);

        //ArrayListe til numre i køen
        ArrayList numbers = new ArrayList<>();

        //bruger .add til at tilføje til Arraylisten 'numbers'
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int newNumber = scn.nextInt();

        //Tilføjer input til index 0 (starten af køen)
        numbers.add(0, newNumber);
        //Fjerner den ældste i køen på index 5
        numbers.remove(5);

        //ptinter køen
        System.out.println(numbers);
    }
}
