package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;


       balance= depositAmount(1000, balance);
       balance = withdraw(2000,balance);
    }

    public static int depositAmount(int amount,int balance) {
        balance += amount;
        System.out.println(amount + "원을 입금하셨습니다. 햔재 잔액:"+ balance+"원");
        return balance;
    }

    public static int withdraw(int amount, int balance) {
        balance -= amount;
        System.out.println(amount + "원을 출급하셨습니다. 현재 잔액 "+ balance+"원");
        return  balance;
    }
}
