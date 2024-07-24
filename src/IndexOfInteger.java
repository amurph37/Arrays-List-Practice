import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (zero to end):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or press enter to finish.");
            }
        }

        System.out.println("Done adding integers to the list.");
        System.out.println("What number are you looking for in the list?");
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (list.contains(number)) {
                System.out.println("The index of " + number + " is: " + list.indexOf(number));
            } else {
                System.out.println(number + " is not in the list.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }

        scanner.close();
    }
}
