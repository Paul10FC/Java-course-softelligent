package Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountProgram {
    public static List<BankAccount> bankAccounts = new ArrayList<>();

    public static void principalMenu(){
        boolean programFinished = false;

        while (!programFinished) {
            System.out.println("What do you want to do?");
            System.out.println("1.- Register\t2.- Login\t0.- Exit");

            Scanner sc = new Scanner(System.in);
            int optionSelected = sc.nextInt();

            switch (optionSelected) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 0:
                    programFinished = true;
                    break;
            }

        }
    }

    private static void loginUser() {
        Scanner sc = new Scanner(System.in);
        boolean accountFinded = false;
        System.out.println("Please, digit your account id");
        int accountId = sc.nextInt();

        for (BankAccount account : bankAccounts) {
            if (accountId == account.getAccountId()){
                System.out.println("Great, your account exists");
                accountFinded = true;
                userAccount(account);
                break;
            }
        }
        if (!accountFinded) System.out.println("Your account isn´t exists");
    }

    private static void userAccount(BankAccount account) {
        System.out.println("Hello " + account.getAccountHolder() + "!");
        System.out.println("What would you like to do?");
        System.out.println("(1) Add money to my account\t(2) Do a withdraw\t(3) See account details");

        Scanner sc = new Scanner(System.in);
        int optionSelected = sc.nextInt();

        switch (optionSelected){
            case 1:
                System.out.println("Your amount is: " + account.getAmount());
                System.out.println("What quantity do you want to add?");
                double quantityToAdd = sc.nextDouble();
                account.addAmountToAccount(quantityToAdd);
                break;
            case 2:
                System.out.println("Your amount is: " + account.getAmount());
                System.out.println("What quantity do you want to withdraw?");
                double quantityToWithdraw = sc.nextDouble();
                account.withdrawMoney(quantityToWithdraw);
                break;
            case 3:
                account.seeAccountData();
                break;
            default:
                System.out.println("Invalid option, try again");
        }
    }

    private static void registerUser() {
        Scanner sc = new Scanner(System.in);
        boolean validOption = false;

        System.out.println("Welcome to the user registration");
        System.out.println("Please, Write your name");

        String name = sc.nextLine();

        while (!validOption){
            System.out.println("Do you want to set an account amount?");
            System.out.println("(1) Yes\t(2) No");

            Scanner optionSc = new Scanner(System.in);
            int optionSelected = optionSc.nextInt();

            switch (optionSelected){
                case 1:
                    Scanner amountSc = new Scanner(System.in);
                    System.out.println("Write your account amount");
                    int accountAmount = amountSc.nextInt();

                    BankAccount accountWithAmount = new BankAccount(name, accountAmount);
                    System.out.println("Great, account created. Your id is: " + accountWithAmount.getAccountId());
                    validOption = true;
                    break;
                case 2:
                    BankAccount accountWithoutAmount = new BankAccount(name);
                    System.out.println("Great, account created. Your id is: " + accountWithoutAmount.getAccountId());
                    validOption = true;
                    break;
                default:
                    System.out.println("Invalid Option, Try again");
            }
        }
    }
}
