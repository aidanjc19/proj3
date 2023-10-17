import java.util.Scanner;

public class SineUI {
    public static final char MENU_BANNER_CHAR= '-';
    public static final int MENU_BANNER_LENGTH= 40;

    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        int userChoice;
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            checkInputIsInt(getUserInput);
            userChoice = getUserInput.nextInt();
            checkMenuInputBounds(userChoice, getUserInput);
            executeMenuChoice(userChoice, getUserInput);
            System.out.print("Press ENTER to continue ...");
            getUserInput.nextLine();
            getUserInput.nextLine();
        } while(userChoice != 0);




        getUserInput.close();

    }


    public static void checkInputIsInt(Scanner getUserInput) {
        while (!getUserInput.hasNextInt()) {
            getUserInput.next();
            System.out.print("Enter your choice: ");
        };
    }

    public static void checkMenuInputBounds(int userChoice, Scanner getUserInput) {
        while (userChoice > 3 || userChoice < 0) {
            System.out.print("Enter your choice: ");
            userChoice = getUserInput.nextInt();
        }

    }

    public static void executeMenuChoice(int userChoice, Scanner getUserInput) {
        switch (userChoice) {
            case 1: break;
            case 2: int totalNumRectangles = 10;
                System.out.printf("The estimated area with " + totalNumRectangles + " rectangles is: %5.4f",
                        SineCalc.riemannSumEstimation(totalNumRectangles));
                System.out.println();
        }
        if (userChoice == 2) {
            int totalNumRectangles = 10;
            System.out.print("How many rectangles would you like to estimate with? ");
//            while (!getUserInput.hasNextInt()) {
//
//            }
            totalNumRectangles = getUserInput.nextInt();
            System.out.printf("The estimated area with " + totalNumRectangles + " rectangles is: %5.4f",
                              SineCalc.riemannSumEstimation(totalNumRectangles));
            System.out.println();
        }
    }

    public static void printMenu() {
        printMenuHeader();
        printMenuBody();
    }

    public static void printMenuBody() {
        System.out.println("1. Find y value for specified radians x");
        System.out.println("2. Estimate area for 0 <= x <= PI");
        System.out.println("3. Draw curve with area estimation rectangles\n");
        System.out.println("0. EXIT the program\n");
    }

    public static void printMenuHeader() {
        printBanner(MENU_BANNER_LENGTH);
        System.out.println("\t\t\tSine Wave Menu");
        printBanner(MENU_BANNER_LENGTH);
    }

    public static void printBanner(int finalLength) {
        for (int length = 0; length <= finalLength; length++) {
            System.out.print(MENU_BANNER_CHAR);
        }
        System.out.println();
    }
}
