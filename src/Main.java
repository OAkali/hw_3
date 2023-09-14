public class Main {
    public static void main(String[] args) throws LimitException{

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000.00);
        System.out.println("У вас на счету: 15000");
        try {
            while (true) {
                bankAccount.withDraw(6000);
                System.out.println("Вы сняли: 6000 ");
            }
        }catch (LimitException e) {
            System.out.println(e.getMessage());
            System.out.println("Проблема: " + e.getMessage());
            Integer remainingAmount = (int) e.getRemainingAmount();
            bankAccount.withDraw(remainingAmount);
            System.out.println("Изъятый оставшийся " + remainingAmount);
        }


    }
}