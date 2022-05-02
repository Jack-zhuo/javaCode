package y22.m04.d29;

import java.util.Random;

public class Demo03_doubleDown {
    public static void main(String[] args) {

        Random r = new Random();
        double n = 10;
        double totalCounter = 0;
        for (int i = 0; i < n; i++) {
            int counter = 0;
            int balance = 10000;
            int betNum = 1;

            while (balance > 0){
                // n < 0.5 win; n > 0.5 lose;
                counter++;
                double p = r.nextDouble();
                if (p < 0.5) {
                    balance = balance + betNum;
                    betNum = 1;
                }else {
                    balance = balance - betNum;
                    betNum = betNum*2;
                }
                // System.out.println("The "+counter+" time,balance: "+balance);
            }
            totalCounter = totalCounter + counter;
        }
        double averageCounter =  totalCounter/n;
        System.out.println(averageCounter);

    }
}
