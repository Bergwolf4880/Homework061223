/*Создать класс Account (счет). У сета должны быть следующие поля
owner (владелец), iban (номер счета), balance, dateOfContract (дата истечения контракта).*/

public class Account {
    private Person owner;

    private String iban;
    private double balance;
    private MyDate dateOfContract;

    public Account(String iban, double balance, Person owner, MyDate date) {

        this.iban = iban;
        this.balance = balance;
        this.dateOfContract = date;
        this.owner = owner;
    }


    public double getBalance() {
        return balance;
    }

    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }

    public void credit(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds");
        }
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    private String maskedIban() {
        String temp = "";
        String maskedIban = "";

        for (int i = 4; i < iban.length() - 3; i++) {
            temp += '*';
            maskedIban = iban.substring(0, 4) + temp + iban.substring(iban.length() - 2);
        }
        return maskedIban;
    }

    public String secureString() {
        int len = iban.length();
        return (len > 7) ? maskedIban() : iban;

    }

    public String toString() {
        return this.owner + "Iban: " + secureString() +
                "\n" + "Account balance: " + this.balance +
                "\n" + "Expires on: " + this.dateOfContract.toString();

    }
}



