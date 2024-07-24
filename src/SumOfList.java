import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (zero to end):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Please enter a valid integer.");
                continue;
            }
            try {
                int number = Integer.parseInt(input);
                if (number == 0) {
                    break;
                }
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        int sum = calculateSum(list);
        System.out.println("The sum of the list is: " + sum);

        scanner.close();
    }

    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
}
