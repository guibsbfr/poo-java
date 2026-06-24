import entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit amount? ");
        char response = sc.next().charAt(0);

        Account acc; // criando uma referência do tipo Account
        if (response == 'y') {
            System.out.print("Enter initial deposit amount: ");
            double initialDeposit = sc.nextDouble();
            acc = new Account(number, holder, initialDeposit); // acc é uma referencia para o novo objeto account, que irá receber as seguintes atribuições (number, holder, initialDeposit)
        }
        else {
            acc = new Account(number, holder);
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(acc.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        acc.deposit(deposit); // chamando o metodo deposit utilizando o obejto referenciado por acc(Account)
        System.out.println("Update account data: ");
        System.out.println(acc.toString());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        acc.withdraw(withdraw);

        System.out.println("Update account data: ");
        System.out.println(acc.toString());

        sc.close();
    }
}