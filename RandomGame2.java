import java.util.Scanner;

import java.util.Random;

public class RandomGame2 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

Random myRandom = new Random();

int computerChoice = myRandom.nextInt(10)+1;

int play = 0; 

int totalPlays = 0;

int wrongPlays = 0;

while(play != computerChoice) {
System.out.print("Enter a number between 1 and 10: ");
play = input.nextInt();
totalplays++;

if(play < 1 || play > 10) {
System.out.println("Invalid input!");
}
else if(play == computerChoice) {
System.out.print("Hurray! you got it right.");
}
else {
wrongPlays++;
if (play < computerChoice) {
System.out.println("Too low!");
}
else {
System.out.println("Too high!");
}

if(wrongPlays == 3) {
computerChoice = myRandom.nextInt(10) + 1;
wrongPlays = 0;
System.out.println("Random number has changed!");
}
}

}


}
}