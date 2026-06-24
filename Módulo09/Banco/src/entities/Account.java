package entities;   // ENTIDADE

public class Account {   // Classe que modela uma conta bancária
    private String holder;
    private double balance;
    private final int number;

    public void deposit(double amount) { // METODO PARA DEPOSITAR VALOR A CONTA
        balance += amount;
    }

    public void withdraw(double amount) {   // METODO PARA SACAR VALOR DA CONTA
        balance -= amount + 5.0;
    }

    public Account(int number, String holder) {   // >>>CONSTRUTOR<<< RESPONSAVEL POR CRIAR O OBJETO ACCOUNT RECENBENDO SEUS ATRIBUTOS
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) { // >>>CONSTRUTOR<<< RESPONSAVEL POR CRIAR O OBJETO ACCOUNT RECENBENDO SEUS ATRIBUTOS
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() { // CAPTAR O NUMERO NA CONTA
        return number;
    }

    public String getHolder() { // CAPTAR O NOME DO USUARIO
        return holder;
    }

    public void setHolder(String holder) { //CAPTAR MUDANÇAS NO NOME, CASO HAJA
        this.holder = holder;
    }

    public double getBalance() {   // FORNECE ACESSO A LEITURA DO SALDO
        return balance;
    }

    public String toString() {   // TOSTRING PADRÃO PARA RETORNAR AS VARIAVEIS EM STRING
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", balance: "
                + String.format("%.2f", balance);
    }
}

