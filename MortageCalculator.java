import java.util.Scanner;

public class MortageCalculator {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the principal amount needed: ");
double principal = input.nextInt();

System.out.print("Enter the annual interest rate: ");
double rate = input.nextInt();

System.out.print("Enter the duration/years needed: ");
double year = input.nextInt();

double percentRate = (rate / 100) / 12;

double duration = year * 12;

double monthlyPayment = principal *  (percentRate * Math.pow (1 + percentRate, duration)) / (Math.pow (1 + percentRate, duration) - 1);


System.out.printf("%.2f", monthlyPayment);
}

}