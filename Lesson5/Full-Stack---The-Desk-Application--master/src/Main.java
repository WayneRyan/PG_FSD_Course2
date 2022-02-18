import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private final ArrayList<Integer> expenses = new ArrayList<>();
    private final String prompt = "Enter your choice:\n" +
            "1. I wish to review my expenditures\n" +
            "2. I wish to add an expenditure\n" +
            "3. I wish to delete an expenditure\n" +
            "4. I wish to sort the expenditures\n" +
            "5. I wish to search for a particular expenditure\n" +
            "6. Close the application\n";
    private boolean isSorted = true;
    private final Scanner sc = new Scanner(System.in);

    public Main() {
        expenses.addAll(Arrays.asList(1000, 2300, 45000, 32000, 110));
        isSorted = false;
    }

    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        Main m = new Main();
        while (true) {
            m.optionsSelection();
        }
    }

    private Integer fetchIntegerValue() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Please type an integer value");
            return fetchIntegerValue();
        }
    }

    private void optionsSelection() {
        System.out.println(prompt);
        switch (fetchIntegerValue()) {
            case 1:
                System.out.println("Your saved expenses are listed below: \n");
                System.out.println(expenses + "\n");
                break;
            case 2:
                System.out.println("Enter the value to add your Expense: \n");
                Integer value = fetchIntegerValue();
                isSorted = expenses.size() == 0 || (isSorted && value > expenses.get(expenses.size() - 1));
                expenses.add(value);
                System.out.println("Your value is updated\n");
                System.out.println(expenses + "\n");
                break;
            case 3:
                System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                if (fetchIntegerValue() == 3) {
                    expenses.clear();
                    System.out.println(expenses + "\n");
                    System.out.println("All your expenses are erased!\n");
                } else {
                    System.out.println("Oops... try again!");
                }
                break;
            case 4:
                Collections.sort(expenses);
                isSorted = true;
                break;
            case 5:
                System.out.println("Enter the expense you need to search:\t");
                int location = searchExpenses(fetchIntegerValue());
                if (location >= 0) {
                    System.out.println("The expense is at index: " + location);
                } else {
                    System.out.println("The expense is not in your list. Should be added at index: " + (-location - 1));
                }
                break;
            case 6:
                closeApp();
                break;
            default:
                System.out.println("You have made an invalid choice!");
                break;
        }
    }

    private void closeApp() {
        System.out.println("Closing your application... \nThank you!");
        System.exit(0);
    }

    private int searchExpenses(Integer searchValue) {
        if (isSorted) {
            return Collections.binarySearch(expenses, searchValue);
        } else {
            for (int i = 0; i < expenses.size(); i++) {
                if (expenses.get(i).equals(searchValue)) {
                    return i;
                }
            }
            return -expenses.size() - 1;
        }
    }

}
