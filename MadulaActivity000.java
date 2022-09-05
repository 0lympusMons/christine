import java.util.Scanner;

public class MadulaActivity000 {

    static Scanner cin = new Scanner(System.in);

    static String[] setElementsInArr(int size) {

        String[] students = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("\nstudent[" + i + "]: ");
            students[i] = cin.nextLine();
        }

        return students;
    };

    static int findIndex(String[] arr, String element) {
        
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        System.out.print("Enter size of the array: ");
        int size = cin.nextInt();

        cin.nextLine();

        String students[] = setElementsInArr(size);

        System.out.print("\nSearch name: ");
        String name = cin.nextLine();

        int index = findIndex(students, name);

        System.out.println("\nIndex: " + index);

    }
}