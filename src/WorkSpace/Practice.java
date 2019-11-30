package WorkSpace;

import java.text.NumberFormat;
import java.util.Scanner;

public class Practice {

    public static void main (String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT_MULTIPLIER = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = sc.nextInt();
        System.out.print("Annual percentage rate: ");
        double annualPercent = sc.nextDouble();
        System.out.print("Term (years): ");
        int term = sc.nextInt();
        double termMonths = term * (double) MONTHS_IN_YEAR;
        double percent = (annualPercent / (double)PERCENT_MULTIPLIER);
        double monthlyPercent = (percent / (double)MONTHS_IN_YEAR);
        double mortgage = principal *
                (monthlyPercent * Math.pow((1 + monthlyPercent),termMonths))
                / (Math.pow((1 + monthlyPercent), termMonths) - 1);
        NumberFormat monthlyPayment = NumberFormat.getCurrencyInstance();
        String result = monthlyPayment.format(mortgage);
        System.out.println("Your mortgage is: " + result);
    }

}