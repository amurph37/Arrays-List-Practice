import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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

        if (!list.isEmpty()) {
            System.out.println("The last string in the list was: " + list.get(list.size() - 1));
        } else {
            System.out.println("The list is empty.");
        }

        scanner.close();
    }
}
