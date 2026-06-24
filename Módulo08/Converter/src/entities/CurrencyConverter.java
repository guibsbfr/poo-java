package entities;

public class CurrencyConverter {

    public double dollarPrice;
    public double dollarBought;

    public CurrencyConverter(double dollarPrice, double dollarBought) {
        this.dollarPrice = dollarPrice;
        this.dollarBought = dollarBought;
    }
    public double totalPayment() {
        return dollarBought * dollarPrice * 1.06;
    }
}
