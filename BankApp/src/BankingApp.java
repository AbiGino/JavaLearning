import java.util.Scanner;
import java.io.File;
class BankDetails {
    private String accNo;
    private String name;
    private String accType;
    private long balance = 0;
//    private double previousTransaction;
    Scanner obj = new Scanner(System.in);

    //method to open new account
    public void createAccount() {
        System.out.print("Enter Account holder Name: ");
        name = obj.next();
        System.out.print("Enter Account No: ");
        accNo = obj.next();
        System.out.print("Enter Account type: ");
        accType = obj.next();
        System.out.print(" Your Current Balance is: " + balance);
//        balance = obj.nextLong();
        System.out.println("\n");
        System.out.println("Your account has been created successfully");
    }

    //method to display account details
    public void getAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accNo);
        System.out.println("Account type: " + accType);
        System.out.println("Balance: " + balance);
    }

    //method to deposit money
    public void deposit() {
            long amount;
            System.out.println("Enter the amount you want to deposit: ");
            amount = obj.nextLong();
            balance = balance + amount;
            System.out.println("Your amount deposited successfully!!");
            previousTransaction = amount;

    }

    //method to withdraw money
    public void withdrawal() {
        long amount;
        System.out.println("Enter the amount you want to withdraw: ");
        amount = obj.nextLong();
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(" Current balance after withdrawal: " + balance);
            previousTransaction = amount;
        } else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!");
        }
    }

    //method to search an account number
    public boolean search(String acc_no) {
        if (accNo.equals(acc_no)) {
            getAccount();
            return true;
        }
        return false;
    }

    public void viewTransaction() {

        if (previousTransaction > 0) {
            System.out.println("Withdrawn:" + previousTransaction);
        }
        else if(previousTransaction<0){
            System.out.println("Deposited amount:" +previousTransaction);
        }
        else {
            System.out.println("No Transaction happened!!");
        }
    }


}
public class BankingApp {
    public static void main(String arg[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("How many number of customers do you want to create?: ");
        int n = obj.nextInt();
        BankDetails b[] = new BankDetails[n];
        for (int i = 0; i < b.length; i++) {
           b[i] = new BankDetails();
            b[i].createAccount();

        }

        int choice;
        do {
            System.out.println("\n ***Welcome to ABC bank***");
            System.out.println("1. Get account details");
            System.out.println("2. Check Account Number");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5. View Transaction details");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = obj.nextInt();
            switch (choice) {


                case 1:
                    for (int i = 0; i < b.length; i++) {
                        b[i].getAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String acc_no = obj.next();
                    boolean found =true;
                    for (int i = 0; i < b.length; i++) {
                        found = b[i].search(acc_no);
                        if (found) {
                            System.out.println("Account number exist..You can continue!!");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Sorry!! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account No. : ");
                    acc_no = obj.next();
                    found = true;
                    for (int i = 0; i < b.length; i++) {
                        found = b[i].search(acc_no);
                        if (found) {
                            b[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Sorry!! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    acc_no = obj.next();
                    found = true;
                    for (int i = 0; i < b.length; i++) {
                        found = b[i].search(acc_no);
                        if (found) {
                            b[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Sorry!! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.print("Enter Account No : ");
                    acc_no = obj.next();
                    found = true;
                    for (int i = 0; i < b.length; i++) {
                        found = b[i].search(acc_no);
                        if (found) {
                            b[i].viewTransaction();
                            break;
                        }
                    }
                        if (!found) {
                            System.out.println("Sorry!! Account doesn't exist..!!");
                        }
                        break;

                case 6:
                    System.out.println("Thanks for using our services!!");
                    break;
            }
        }
        while (choice != 6);
    }
}


