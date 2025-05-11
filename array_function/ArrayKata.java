public class ArrayKata {

	public static int maximumIn(int[] array) {
		if(array == null || array.length == 0) {
			throw new illegalArguementException("array must not be empty");
		}

		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int minimumIn(int[] array) {
		if(array == null || array.length == 0) {
			throw new illegalArguementException("array must not be empty");
		}
		
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		min = array[i];
	}

	public static int sumOf(int[] array) {
		if(array == null || array.length == 0) {
			throw new illegalArguementException("array must not be empty");
		}
		
		int sum = 0;
		for(int number = 0; number < array.length; number++) {
			sum = sum + array[number];
		}
		return sum;		
	}

	public static int sumOfEvenNumbersIn(int[] array) {
		int sumEven = 0;
		for(int num = 0; num < array.length; num++) {
			if(num % 2 == 0) {
				sum = sum + array[num];
			}
		}
		return sumEven;
	}

	public static int sumOfOddNumbersIn(int[] array) {
		int sumOdd = 0;
		for(int num = 0; num < array.length; num++) {
			if(num % 2 != 0) {
				sum = sum + array[num];
			}
		}
		return sumOdd;
	}

	public static int maximumAndMinimumOf(int[] array) {
		int max = array[0];
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(i > max) {
				max = array[i];
			} 
			if(i < min) {
				min = array[j];
			}
		}
		return new int []{max, min};
	}

	public static int noOfOddNumbersIn(int[] array) {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(i % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	public static int noOfEvenNumbersIn(int[] array) {
		int count = 0;
		for(int i = 0, i < array.length; i++) {
			if(i % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static int evenNumbersin(int[] array) {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
				count++;
			}

		}
		int[index] = 0; 
		for(int j = 0; j < array.length; j++) {
			if(j % 2 == 0) {
				array[j]
			}
		}
	}

	public static int oddNumbersIn(int[] array) {
		
	}

	public static int squareNumbersIn(int[] array) {
		
	}

}