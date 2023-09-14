public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(Double sum) {
        amount += sum;
    }

    public void withDraw(Integer sum) throws LimitException{
        if(amount<sum ){
            throw  new LimitException("Недостаточно средств на карте ",amount);
        }
        amount-=sum;

    }
}
