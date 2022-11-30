public class Account extends Customer{
private int balance;
int preTransaction;
int amount;


    void deposit(int amount){
        balance = balance + amount;
        preTransaction = amount;
    }

    void withdraw(int amount){
        balance = balance -amount;
        preTransaction = -amount;
    }

    void getPreTransaction(){
        if(amount > 0){
            System.out.println("Du la in: " + preTransaction);
        }
        else if(amount < 0){
            System.out.println("Du tog ut: " + Math.abs(preTransaction));
        }
        else{
            System.out.println("Ingen transaktion inträffade");
        }
    }

    public int getBalance() {
        return balance;
    }
}
