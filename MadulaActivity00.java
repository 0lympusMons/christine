import java.util.Scanner;

public class MadulaActivity00 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // System.out.println("Enter size of the array: ");
        // int size = cin.nextInt();

        // String students[] = new String[size];
        String students[] = { "Dodge", "Ynoh", "Angelo" };

        System.out.println("Enter name: ");
        String name = cin.nextLine();

        int index = -1;
        for (int i = 0; i < students.length; i++) {

            if (students[i].equals(name)) {
                index = i;
            }
        }

        if (index != -1) {

            System.out.println("Index of " + name + " is " + index);
        } else {
            System.out.println(index);
        }

    }
}