/*Создать класс Account (счет). У сета должны быть следующие поля
owner (владелец), iban (номер счета), balance, dateOfContract (дата истечения контракта).
Owner - сам по себе класс (firstName, lastName, birthday) Для отражения дат используем класс MyDate созданный ранее.
В каждом классе должен быть конструктор и метод toString.

создайте класс Accounts который должен управлять всеми счетами. Кроме метода toString в этом классе должны быть методы:

метод, который выводит на экран все счета, с балансом меньше заданного числа
метод, который считает сумму всех остатков, на всех счетах банка*/


import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //region Client Accounts
        Account[] clients = {
                new Account("DE31500105171979783411", 23323.21,
                        new Person("John", "Doe", new MyDate(1, 6, 1968)),
                        new MyDate(23, 4, 2025)),

                new Account("DE81564", 323.15,
                        new Person("Samantha", "Jones", new MyDate(17, 2, 1975)),
                        new MyDate(13, 6, 2021)),

                new Account("TN8425183414187237278837", 723323.78,
                        new Person("Travis", "Drinkwater", new MyDate(25, 12, 1986)),
                        new MyDate(3, 7, 2015)),

                new Account("PL61109024023325239786498322", 213323.9,
                        new Person("Amanda", "Smith", new MyDate(12, 3, 1992)),
                        new MyDate(18, 8, 2064)),

                new Account("GB57654654687475521355456", 656323.5,
                        new Person("Mike", "Rotch", new MyDate(30, 1, 2000)),
                        new MyDate(30, 9, 2035)),

                new Account("DE8435938434583948345", 1092922992,
                        new Person("Vassili", "Pupkin", new MyDate(12, 5, 1953)),
                        new MyDate(15, 3, 2020))
        };

        AccountManager manager = new AccountManager(clients);


        manager.getBalanceOverLimit(50000);
        System.out.println("All the finances after the count - " + manager.accountBalanceSummary() + " €");
        System.out.println("------------------------------");

        System.out.println(manager.getAccounts()[4].getOwner().getFirstName().toString());
        manager.getAccounts()[4].getOwner().setFirstName("Marcello");
        System.out.println(manager.getAccounts()[4].getOwner().getFirstName().toString());
        System.out.println("------------------------------");
        System.out.println(manager.getAccounts()[2].getOwner().getBirthday().toString());
        System.out.println("------------------------------");
        System.out.println(manager.getAccounts()[0].getOwner().getFirstName());


    }
}
