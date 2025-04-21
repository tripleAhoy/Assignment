import java.util.Scanner;

public class NaturalNumbers {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a positive number: ");
int number = input.nextInt();

if(number <= 0) {
System.out.print("Invalid! Enter a positive number.");
}
else {
int sum = 0;
int increase = 1;

while(increase <=  number) {
sum = sum + increase;
increase++;
}
System.out.printf("The sum of the first 10 natural number is: %d%n", sum);
}

}
}