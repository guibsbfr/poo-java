import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Whats the dollar price: ");
        double dollarPrice = sc.nextDouble();
        System.out.print("Whats the dollar bought: ");
        double dollarBought = sc.nextDouble();
        CurrencyConverter cc = new CurrencyConverter(dollarPrice, dollarBought);

        System.out.printf("Amount to be paid in reais = " +
                String.format("%.2f", cc.totalPayment()));

        sc.close();
    }
}