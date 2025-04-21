import java.util.Scanner;

public class SumLoop {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

String choice;

do {
System.out.print("Enter number: ");
int number1 = input.nextInt();

System.out.print("Enter number: ");
int number2 = input.nextInt();

int sum = number1 + number2;
System.out.printf("The sum is: %d%n", sum);

System.out.print("Do you want to keep playing? ");
choice = input.next();

}while (choice == ("no")); 

System.out.print("Thanks for playing. Goodbye!");
}
}