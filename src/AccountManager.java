public class AccountManager {
    Account[] accounts;

    public AccountManager(Account[] accounts) {

        this.accounts = accounts;
    }
    public Account[] getAccounts(){
        return accounts;
    }
    public String toString() {
        String result = "";
        for (Account account : accounts) {
            result += account + "\n\n";

        }
        return result;
    }
    public void getBalanceOverLimit(double limit) {

        for (Account acc : accounts) {
            if (acc.getBalance() > limit) {
                System.out.println("CLient with Iban: " + acc.secureString() + ", has " + acc.getBalance() + " € on his balance.\n");
            }
        }

    }
    public double accountBalanceSummary() {
        double temp = 0;
        for (Account acc : accounts) {
            temp += acc.getBalance();
        }
        return temp;
    }

}
