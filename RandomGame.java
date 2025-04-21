import java.util.Scanner;

import java.util.Random;

public class RandomGame {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

Random myRandom = new Random();

int computerChoice = myRandom.nextInt(10)+1;

int number = 0;
int play = 0;

while(number != computerChoice) {
System.out.print("Enter number between 1 and 10: ");
number = input.nextInt();
play++;

if(number < 1 || number > 10) {
System.out.println("Invalid Input!");
}
else if(number > computerChoice) {
System.out.println("Too high!");
}
else if(number < computerChoice) {
System.out.println("Too low!");
}
else {
System.out.println("Congratulations! you got it right in " + play + " plays");
}

}

}
}