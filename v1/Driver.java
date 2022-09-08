
/**
 * This program takes in a .txt file, then converts it into an array. 
 * It then outputs the index of the number that the user has searched.
 *
 * @author (Dodge Ynoh Angelo Dungog Madula)
 * @version (Sept 8, 2022)
 */

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Driver {

    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        // load content of file based on specific delimiter: ","
        Scanner sc = new Scanner(new FileReader("array.txt"))
                .useDelimiter(",\\s*");

        Integer array[] = Functions.convertFileToArray(sc);

        // outputs elements inside array
        System.out.println("Elements inside array: ");
        Functions.outputElementsInArr(array);

        // asks user input for element to search
        System.out.print("\nEnter number to search: ");
        String toSearch = cin.nextLine();

        // stores the index of what the user inputted
        Integer index[] = Functions.findIndex(array, toSearch);

        // outputs the index of toSearch; outputs the indices in which toSearch was
        // detected in the array or outputs -1 if it does not exist
        System.out.print("\nIndex of " + toSearch + ": ");

        if (index.length != 0) {
            for (int i = 0; i < index.length; i++) {

                System.out.print(index[i]);

                if (index.length >= 2 && ((i + 1) < index.length)) {
                    System.out.print(", ");
                }
            }
        } else if (index.length == 0) {
            System.out.println("-1. Element not found.");

        }

    }
}