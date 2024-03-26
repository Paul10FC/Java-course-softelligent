package Account;

import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.Random;

@Getter
@ToString
public class BankAccount {
    private final String accountHolder;
    private double amount;
    private final int accountId;

    public BankAccount(String accountHolder, double amount) {
        this.accountId = idAccountCheckout();
        this.accountHolder = accountHolder;
        this.amount = amount;
        BankAccountProgram.bankAccounts.add(this);

    }

    public BankAccount(String accountHolder) {
        this.accountId = idAccountCheckout();
        this.accountHolder = accountHolder;
        BankAccountProgram.bankAccounts.add(this);
    }

    public void addAmountToAccount(double quantityToAdd){

        if (quantityToAdd > 0){
            this.amount = amount + quantityToAdd;
            System.out.println("Great! Your new amount is " + this.amount);
        } else {
            System.out.println("You can´t input negative numbers");
            System.out.println("Your amount is still " + this.amount);
        }
    }

    public void  withdrawMoney(double quantityToWithdraw){
        double balanceAfterTransaction = this.amount - quantityToWithdraw;

        if (balanceAfterTransaction >= 0){
            this.amount = balanceAfterTransaction;
            System.out.println("Withdraw complete, your account balance is " + this.amount);
        } else {
            System.out.println("You don´t have this money quantity to withdraw");
        }
    }

    private int idAccountCheckout(){
        boolean isIdUnique = false;
        int actualAccountId = 0;

        while (!isIdUnique) {
            Random randomNumber = new Random();
            actualAccountId = randomNumber.nextInt(900) + 100;

            if (BankAccountProgram.bankAccounts.isEmpty()){
                return actualAccountId;
            } else {
                for (BankAccount account : BankAccountProgram.bankAccounts) {
                    if (account.getAccountId() == accountId) {
                        isIdUnique = false;
                        break;
                    }
                    isIdUnique = true;
                }
            }
        }
        return actualAccountId;
    }
}
