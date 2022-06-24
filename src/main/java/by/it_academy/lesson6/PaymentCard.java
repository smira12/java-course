package by.it_academy.lesson6;

public class PaymentCard {
    private double balance;

    public PaymentCard(double startBalance) {
        this.balance = startBalance;
    }


    public static void main(String[] args) {
        PaymentCard AlfaBank = new PaymentCard(5);
        AlfaBank.eatAffordably();
        System.out.println(AlfaBank.toString());
        AlfaBank.addMoney(10);
        System.out.println(AlfaBank.toString());
        AlfaBank.eatHeartily();
        System.out.println(AlfaBank.toString());
    }

    public String toString() {
        return ("The card  has a balance " + balance);
    }

    void eatAffordably() {
        if (balance - 2.6 >= 0) {
            balance -= 2.6;
        }
    }

    void eatHeartily() {
        if (balance - 4.6 >= 0) {
            balance -= 4.6;
        }
    }

    void addMoney(double amount) {
        if (balance >= 0)
            balance = balance + amount;
    }
}