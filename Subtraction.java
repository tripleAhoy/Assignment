import java.util.Random;
import java.util.Scanner;
public class Subtraction{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random myRandom = new Random();		

		int firstNumber = myRandom.nextInt(100);
		int secondNumber = myRandom.nextInt(100);
		int result = firstNumber - secondNumber;
		int attempt = 0;

		if(secondNumber > firstNumber) {
			firstNumber = secondNumber;
			secondNumber = firstNumber;
		}
		

		while(attempt < 10) {
		System.out.printf("what is %d - %d?%n", firstNumber, secondNumber);

		System.out.print("pick an answer: ");
		int answer = input.nextInt();
		attempt++;

		if (result == userAnswer) {
			System.out.println("Correct");
		}
		else{
			System.out.println("Wrong")
		}

		
		}



		


	}
}