package com.joysistvi.loadreg.main;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static double loadBalance = 500.0;

    static String[] promoHistory = new String[30];
    static int historyCount = 0;

    public static void main(String[] args) {

        validateUssdCode();

        while (true) {
            try {
                clearScreen();
                mainMenu();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input! Please enter a number only.");
                scanner.nextLine();
                pause();
            }
        }
    }

    public static void validateUssdCode() {
        System.out.println("=======================================");
        System.out.println("        GLOBE TELECOM SERVICES");
        System.out.println("=======================================");
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");

        String ussdCode = scanner.nextLine();

        if (ussdCode.isEmpty() || !ussdCode.trim().equals("*143#")) {
            System.out.println("Invalid USSD Code. Exiting...");
            System.exit(0);
        }
    }

    public static void mainMenu() {
        System.out.println("=======================================");
        System.out.println("              GLOBE *143#");
        System.out.println("=======================================");
        System.out.println("    [1] Go+ Promos");
        System.out.println("    [2] GoSURF Promos");
        System.out.println("    [3] GoUNLI Promos");
        System.out.println("    [4] Call Promos");
        System.out.println("    [5] Text Promos");
        System.out.println("    [6] Call N Text Promos");
        System.out.println("    [7] Check Balance");
        System.out.println("    [8] Load Balance");
        System.out.println("    [9] Promo History");
        System.out.println("    [10] Exit");
        System.out.print("Enter choice: ");

        int mainMenuChoice = scanner.nextInt();

        switch (mainMenuChoice) {
            case 1:
                goPlusPromo();
                break;
            case 2:
                goSurfPromo();
                break;
            case 3:
                goUnliPromo();
                break;
            case 4:
                callPromo();
                break;
            case 5:
                textPromo();
                break;
            case 6:
                callNTextPromo();
                break;
            case 7:
                checkBalance();
                break;
            case 8:
                loadBalance();
                break;
            case 9:
                showPromoHistory();
                break;
            case 10:
                clearScreen();
                System.out.println("Thank you for using Globe Telecom Services.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice!");
                pause();
        }
    }

    public static void goPlusPromo() {
        try {
            clearScreen();

            System.out.println("=======================================");
            System.out.println("              GO+ PROMOS");
            System.out.println("=======================================");
            System.out.println("    [1] Go+99  - 7 Days for P99");
            System.out.println("    [2] Go+149 - 15 Days for P149");
            System.out.println("    [3] Go+250 - 15 Days for P250");
            System.out.println("    [4] Back");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    subscriptionConfirmation("Go+99", 7, 99);
                    break;
                case 2:
                    subscriptionConfirmation("Go+149", 15, 149);
                    break;
                case 3:
                    subscriptionConfirmation("Go+250", 15, 250);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Choice!");
                    pause();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter a number only.");
            scanner.nextLine();
            pause();
        }
    }

    public static void goSurfPromo() {
        try {
            clearScreen();

            System.out.println("=======================================");
            System.out.println("             GOSURF PROMOS");
            System.out.println("=======================================");
            System.out.println("    [1] GoSURF50  - 3 Days for P50");
            System.out.println("    [2] GoSURF99  - 7 Days for P99");
            System.out.println("    [3] GoSURF199 - 15 Days for P199");
            System.out.println("    [4] GoSURF299 - 30 Days for P299");
            System.out.println("    [5] Back");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    subscriptionConfirmation("GoSURF50", 3, 50);
                    break;
                case 2:
                    subscriptionConfirmation("GoSURF99", 7, 99);
                    break;
                case 3:
                    subscriptionConfirmation("GoSURF199", 15, 199);
                    break;
                case 4:
                    subscriptionConfirmation("GoSURF299", 30, 299);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice!");
                    pause();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter a number only.");
            scanner.nextLine();
            pause();
        }
    }

    public static void goUnliPromo() {
        try {
            clearScreen();

            System.out.println("=======================================");
            System.out.println("             GOUNLI PROMOS");
            System.out.println("=======================================");
            System.out.println("    [1] GoUNLI149 - 7 Days for P149");
            System.out.println("    [2] GoUNLI299 - 30 Days for P299");
            System.out.println("    [3] GoUNLI599 - 30 Days for P599");
            System.out.println("    [4] Back");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    subscriptionConfirmation("GoUNLI149", 7, 149);
                    break;
                case 2:
                    subscriptionConfirmation("GoUNLI299", 30, 299);
                    break;
                case 3:
                    subscriptionConfirmation("GoUNLI599", 30, 599);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Choice!");
                    pause();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter a number only.");
            scanner.nextLine();
            pause();
        }
    }

    public static void callPromo() {
        try {
            clearScreen();

            System.out.println("=======================================");
            System.out.println("              CALL PROMOS");
            System.out.println("=======================================");
            System.out.println("    [1] DUO20      - 1 Day for P20");
            System.out.println("    [2] DUO50      - 3 Days for P50");
            System.out.println("    [3] ALLNET100  - 7 Days for P100");
            System.out.println("    [4] ALLNET200  - 15 Days for P200");
            System.out.println("    [5] Back");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    subscriptionConfirmation("DUO20", 1, 20);
                    break;
                case 2:
                    subscriptionConfirmation("DUO50", 3, 50);
                    break;
                case 3:
                    subscriptionConfirmation("ALLNET100", 7, 100);
                    break;
                case 4:
                    subscriptionConfirmation("ALLNET200", 15, 200);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice!");
                    pause();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter a number only.");
            scanner.nextLine();
            pause();
        }
    }

    public static void textPromo() {
        try {
            clearScreen();

            System.out.println("=======================================");
            System.out.println("              TEXT PROMOS");
            System.out.println("=======================================");
            System.out.println("    [1] ALLTXT20  - 2 Days for P20");
            System.out.println("    [2] ALLTXT30  - 3 Days for P30");
            System.out.println("    [3] ALLTXT50  - 5 Days for P50");
            System.out.println("    [4] ALLTXT100 - 15 Days for P100");
            System.out.println("    [5] Back");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    subscriptionConfirmation("ALLTXT20", 2, 20);
                    break;
                case 2:
                    subscriptionConfirmation("ALLTXT30", 3, 30);
                    break;
                case 3:
                    subscriptionConfirmation("ALLTXT50", 5, 50);
                    break;
                case 4:
                    subscriptionConfirmation("ALLTXT100", 15, 100);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice!");
                    pause();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter a number only.");
            scanner.nextLine();
            pause();
        }
    }

    public static void callNTextPromo() {
        try {
            clearScreen();

            System.out.println("=======================================");
            System.out.println("          CALL N TEXT PROMOS");
            System.out.println("=======================================");
            System.out.println("    [1] COMBO50  - 3 Days for P50");
            System.out.println("    [2] COMBO99  - 7 Days for P99");
            System.out.println("    [3] COMBO149 - 15 Days for P149");
            System.out.println("    [4] COMBO299 - 30 Days for P299");
            System.out.println("    [5] Back");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    subscriptionConfirmation("COMBO50", 3, 50);
                    break;
                case 2:
                    subscriptionConfirmation("COMBO99", 7, 99);
                    break;
                case 3:
                    subscriptionConfirmation("COMBO149", 15, 149);
                    break;
                case 4:
                    subscriptionConfirmation("COMBO299", 30, 299);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice!");
                    pause();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter a number only.");
            scanner.nextLine();
            pause();
        }
    }

    public static void subscriptionConfirmation(String promo, int days, int price) {
        try {
            clearScreen();

            System.out.println("=======================================");
            System.out.println("        SUBSCRIPTION CONFIRMATION");
            System.out.println("=======================================");
            System.out.println("Promo Name : " + promo);
            System.out.println("Validity   : " + days + " Day/s");
            System.out.println("Price      : P" + price);
            System.out.println("---------------------------------------");
            System.out.println("    [1] Subscribe");
            System.out.println("    [2] Back");
            System.out.println("    [3] Exit");
            System.out.print("Enter choice: ");

            int confirmationChoice = scanner.nextInt();

            if (confirmationChoice == 1) {

                if (loadBalance >= price) {
                    loadBalance -= price;

                    int referenceNumber = (int) (Math.random() * 900000) + 100000;

                    if (historyCount < promoHistory.length) {
                        promoHistory[historyCount] = promo + " | P" + price + " | " + days + " Day/s | Ref No: "
                                + referenceNumber;
                        historyCount++;
                    }

                    clearScreen();

                    System.out.println("=======================================");
                    System.out.println("        REGISTRATION SUCCESSFUL");
                    System.out.println("=======================================");
                    System.out.println("You are now registered to " + promo + ".");
                    System.out.println("Good for " + days + " Day/s.");
                    System.out.println("Amount Deducted : P" + price);
                    System.out.println("Reference No.   : " + referenceNumber);
                    System.out.println("---------------------------------------");
                    System.out.printf("Remaining Balance: P%.2f%n", loadBalance);

                    pause();

                } else {
                    clearScreen();

                    System.out.println("=======================================");
                    System.out.println("          INSUFFICIENT BALANCE");
                    System.out.println("=======================================");
                    System.out.println("You do not have enough load balance.");
                    System.out.printf("Current Balance : P%.2f%n", loadBalance);
                    System.out.println("Promo Price     : P" + price);

                    pause();
                }

            } else if (confirmationChoice == 2) {
                return;

            } else if (confirmationChoice == 3) {
                System.out.println("Thank you for using Globe Telecom Services.");
                System.exit(0);

            } else {
                System.out.println("Invalid Choice!");
                pause();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter a number only.");
            scanner.nextLine();
            pause();
        }
    }

    public static void checkBalance() {
        clearScreen();

        System.out.println("=======================================");
        System.out.println("              CHECK BALANCE");
        System.out.println("=======================================");
        System.out.printf("Your current load balance is: P%.2f%n", loadBalance);

        pause();
    }

    public static void loadBalance() {
        try {
            clearScreen();

            System.out.println("=======================================");
            System.out.println("              LOAD BALANCE");
            System.out.println("=======================================");
            System.out.print("Enter amount to load: P");

            double amount = scanner.nextDouble();

            if (amount > 0) {
                double oldBalance = loadBalance;
                loadBalance += amount;

                clearScreen();

                System.out.println("=======================================");
                System.out.println("           LOAD SUCCESSFUL");
                System.out.println("=======================================");
                System.out.printf("Old Balance : P%.2f%n", oldBalance);
                System.out.printf("Loaded      : P%.2f%n", amount);
                System.out.printf("New Balance : P%.2f%n", loadBalance);

            } else {
                System.out.println("Invalid amount!");
            }

            pause();

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter a valid amount.");
            scanner.nextLine();
            pause();
        }
    }

    public static void showPromoHistory() {
        clearScreen();

        System.out.println("=======================================");
        System.out.println("              PROMO HISTORY");
        System.out.println("=======================================");

        if (historyCount == 0) {
            System.out.println("No registered promos yet.");
        } else {
            for (int i = 0; i < historyCount; i++) {
                System.out.println((i + 1) + ". " + promoHistory[i]);
            }
        }

        pause();
    }

    public static void pause() {
        System.out.println();
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}