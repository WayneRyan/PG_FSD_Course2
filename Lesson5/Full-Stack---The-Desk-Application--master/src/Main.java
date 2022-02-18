import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();
    }

    private static void optionsSelection() {
        String prompt = "1. I wish to review my expenditures\n" +
                "2. I wish to add an expenditure\n"+
                "3. I wish to delete an expenditure\n"+
                "4. I wish to search for a particular expenditure\n"+
                "5. Close the application\n";
        ArrayList<Integer> expenses = new ArrayList<Integer>(Arrays.asList(1000,2300,45000,32000,110));
        sortExpenses(expenses);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter your choice:\t");
            System.out.println(prompt);
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Your saved expenses are listed below: \n");
                    System.out.println(expenses + "\n");
                    break;
                case 2:
                    System.out.println("Enter the value to add your Expense: \n");
                    Integer value = sc.nextInt();
                    int index = searchExpenses(expenses, value);
                    if (index<0) {index = -(index + 1);}
                    expenses.add(index,value);
                    System.out.println("Your value is updated\n");
                    System.out.println(expenses + "\n");
                    break;
                case 3:
                    System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                    if (sc.nextInt() == 3) {
                        expenses.clear();
                        System.out.println(expenses + "\n");
                        System.out.println("All your expenses are erased!\n");
                    } else {
                        System.out.println("Oops... try again!");
                    }
                    break;
                case 4:
                    System.out.println("Enter the expense you need to search:\t");
                    int location = searchExpenses(expenses, sc.nextInt());
                    if (location > 0) {
                        System.out.println("The expense is at index: "  + location);
                    } else {
                        System.out.println("The expense is not in your list. Should be added at index: " + location);
                    }
                    break;
                case 5:
                    closeApp();
                    break;
                default:
                    System.out.println("You have made an invalid choice!");
                    break;
            }
        }
    }

    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
        System.exit(0);
    }

    private static int searchExpenses(ArrayList<Integer> arrayList, Integer searchValue) {
        return Collections.binarySearch(arrayList,searchValue);
    }

    private static void sortExpenses(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
    }
}
