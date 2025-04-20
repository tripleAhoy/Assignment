import java.util.Scanner;

public class Factorial {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a non-negative number: ");
int number = input.nextInt();

if(number < 0) {
System.out.println("Invalid!");
}
else {
long factorial = 1;
int i = 1;

while(i <= number) {
factorial = factorial * i;
i++;
}
System.out.printf("Factorial of %d is : %d%n", number, factorial);
}

}
}