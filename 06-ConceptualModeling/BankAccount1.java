public class BankAccount1{

    private float balance;
    
    public void deposit(float amount){
        this.balance+=amount;
    }

    public void withdraw(float amount){
        if(amount<=500){
        if(amount>this.balance){
            System.out.println("Nie masz wystarczająco środków na koncie.");
        }else{
            this.balance-=amount;
        }}else{
            System.out.println("Maksymalna wartość którą można wybrać to 500 PLN");
        }
    }

    public void displayBalance(){
        System.out.println("Ilość twoich środków na koncie to "+balance+" PLN");
    }

    public static void main(String[] args) {
        BankAccount1 b1 = new BankAccount1();
        b1.deposit(500);
        b1.displayBalance();
        b1.deposit(200);
        b1.displayBalance();
        b1.withdraw(300);
        b1.displayBalance();
        b1.withdraw(1000);
        b1.displayBalance();
    }

}