import java.util.Scanner;

public class PrimeNumbers {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter positive integer: ");
int number = input.nextInt();

if(number < 0) {
System.out.println("Please enter a positive number.");
}
else if(number == 1) {
System.out.println("1 is not a prime number");
}
else {
int i = 2;

while(i <= number / 2) {
if (number % i == 0) {
System.out.print(number + " is not a prime number.");
break;
}
i++;
}

if(i > number / 2) {
System.out.println(number + " is a prime number.");
}
}

}
}