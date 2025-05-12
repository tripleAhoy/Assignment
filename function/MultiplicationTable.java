public class MultiplicationTable {

	public static int isMultiplication(int number1, int number2) {
		System.out.println("\n Multiplication Table (" + number1 + " to " + number2 + ")\n");
		System.out.print("  ");
		for(int i = number1; i <= number2; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n" + "-".repeat((number2 - number1 + 1) * 8));

		for(int i = number1; i <= number2;  i++) {
			System.out.print(i + "|");
			for(int j = number1; j <= number2; j++) {
				System.out.print((i * j) + "\t");
			}
			System.out.println();
		}
		return number1 + number2;
	}

}