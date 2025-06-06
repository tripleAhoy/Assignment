import java.util.Scanner;

public class MenstrualApp {

	public static int lengthCycle(int num1, int num2) {
	
		int cycleLength = num2 - num1;
		if (cycleLength < 21) {
			System.out.println("Abnormal cycle. Too short");
		}else if(cycleLength > 35) {
			System.out.println("Abnormal cycle. Too long");
		}else {
			System.out.println("normal cycle.");
		}
		return cycleLength;	
	}

	public static int fertilityWindow(int cycleLength) {
		return cycleLength - 14;

	}

	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the date of your first cycle: ");
		int firstDay = scanner.nextInt();
		System.out.print("Enter next date of your first cycle: ");
		int nextDay = scanner.nextInt();
		
		int cycleLength = lengthCycle(firstDay, nextDay);
		int ovulationDay = fertilityWindow(cycleLength);
		
		System.out.println("Your cycle-length is " + cycleLength + " days.");
		System.out.println("Your estimated ovulaton date is around day " + ovulationDay + " of your cycle");
	}
}