import java.util.Scanner;

public class BankAcount(String account) {
    public String accountNumber;

    public Integer balance = 0;

    public static void deposit(){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        String depositAmount = x.nextLine();
        balance += Integer.parseInt(depositAmount);
        System.out.println("Balance after depositing: " + balance);
    }

    public static void withdraw(){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter withdraw amount: ");
        String depositAmount = x.nextLine();
        balance -= Integer.parseInt(depositAmount);
        System.out.println("Balance after withdrowing: " + balance);
    }
    public void main(String account) {
        BankAcount bankAcount = new BankAcount();
        bankAcount.accountNumber = account;
    }

}


