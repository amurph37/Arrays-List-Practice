import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter strings (empty string to end):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }

        if (list.size() >= 5) {
            System.out.println("The fifth string in the list was: " + list.get(4));
        } else {
            System.out.println("There are less than 5 items in the list.");
        }

        scanner.close();
    }
}