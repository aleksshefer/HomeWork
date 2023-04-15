package Exceptions;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("Alex", 100);

        try {
            account.withdraw("Alex", 10);
            account.withdraw("Alex", 100);
        } catch (NotEnoughFundsException e) {
            System.out.println("не хватает денег");
        }
        try {
            account.withdraw("Aleks", 100);
        } catch (NotEnoughFundsException e) {
            System.out.println("не хватает денег");
        } catch (IncorrectNameException e){
            System.out.println("не тот пользователь");
        }

    }
}
