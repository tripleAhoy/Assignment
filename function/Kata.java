public class Kata {

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static boolean isPrime(int number) {
		if(number == 1) return false;
		if(number == 2) return true;
		if (number % 2 == 0) return false;

		for(int i = 3; i * i <= number; i++ ) {
			if(number % i == 0) return false;
		}
		return true;
	}

	public static int isDifference(int number1, int number2) {
		if (number2 > number1 ) {
			return number2 - number1;
		}
		else{
			return number1 - number2;
		}

	}

	public static int isQuotient(int number1, int number2) {
		int quotient = number1 / number2;
		return quotient;
	}

	public static int isFactor(int number) {
		int count = 0;
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				count++;
			}
		}
	return count;
	}

	public static boolean isSquare(int number) {
		for(int i = 1; i * i <= number; i++) {
			if(i * i == number) {
				return true;
			}

		}
		return false;
	}

	public static boolean isPalindrome(int number) {
		if (number >= 10000 && number <= 99999){
			int digit5 = number % 10;
			int remainder = number / 10;
			int digit4 = remainder % 10;
			remainder = remainder / 10;
			int digit3 = remainder % 10;
			remainder = remainder /10;
			int digit2 = remainder % 10;
			int digit1 = remainder / 10; 

			if(digit1 == digit5 && digit2 == digit4) 
				return true;
		}
		return false;
	}

	public static int factorialOf(int number) {
		int factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial = factorial * i;
		} 
		return factorial;
	}
		public static int squareOf(int number) {
		int square = number * number;
		return square;
	}
}