import java.util.Random;

import java.util.Scanner;

public class RandomMystery0 {

public static void main(String[] args) {

Random myRand = new Random();

int computer = myRand.nextInt(10)+1;

Scanner input = new Scanner(System.in);

System.out.print("Please enter numbers between 1 and 10: ");
int number1 = input.nextInt();

int number2 = 0;
int number3 = 0;
 
if(number1 == computer) System.out.print("Congratulations! you guessed correctly");

if(number1 != computer) {
if(number1 <= 0 || number1 >= 11) {
System.out.println("Invalid Number!");
System.out.print("Please enter numbers 1 and 10: ");
number2 = input.nextInt();
}else
if(number1 < computer) {
System.out.println("Too low!");
System.out.print("Please enter numbers 1 and 10: ");
number2 = input.nextInt();
}else
if(number1 > computer) {
System.out.println("Too high!");
System.out.print("Please enter numbers 1 and 10: ");
number2 = input.nextInt();
}


if(number2 == computer) System.out.print("Congratulations! you guessed correctly");

if(number2 != computer) {
if(number2 <= 0 || number2 >= 11) {
System.out.println("Invalid Number!");
System.out.print("Please enter numbers 1 and 10: ");
number3 = input.nextInt();
}else
if(number2 < computer) {
System.out.println("Too low!");
System.out.print("Please enter numbers 1 and 10: ");
number3 = input.nextInt();
}else
if(number2 > computer) {
System.out.println("Too high!");
System.out.print("Please enter numbers 1 and 10: ");
number3 = input.nextInt();
}


if(number3 == computer) System.out.print("Congratulations! you guessed correctly");

if(number3 != computer) {
if(number3 <= 0 || number3 >= 11) {
System.out.println("Invalid Number!");
System.out.print("Game Over!");
}else
if(number3 < computer) {
System.out.println("Too low!");
System.out.print("Game Over!");
}else
if(number3 > computer) {
System.out.println("Too high!");
System.out.print("Game Over!");
}
} 

} 

}


}
}