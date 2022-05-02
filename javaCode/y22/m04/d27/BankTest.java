package y22.m04.d27;

class Bank {
    private String account;
    private String name;
    private String address;
    private double balance;
    private static double minBalance = 10;

    Bank(String account,String name,String address,double balance){
        this.account = account;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    void deposit(double sum) {
        System.out.println("原有余额：" + balance+",今日存款："+ sum);
        System.out.println("今日最终余额：" + (balance += sum));
    }

    void drawMoney(double sum) {
        if ((balance - sum) < minBalance){
            System.out.println("余额小于最小余额，拒绝取款，你至少要保留十元钱。");
        }else {
            balance-=sum;
            System.out.println("已成功取款"+sum+",剩余余额："+balance);
        }
    }
    void query(){
        System.out.println("余额："+balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank zy = new Bank("001", "卓越", "三联学院", 100);
        zy.deposit(100);
        zy.drawMoney(191);
        zy.query();
    }
}
