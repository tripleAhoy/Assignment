public class BookApp {

	public static int isNumberCopies(int copies) {
		int price = 0;
		int priceCopies = price * copies;
		if(copies >= 1 && copies <= 4) {
			price = 2000;
			priceCopies = price * copies;
		}
		else if (copies >= 5 && copies <= 9) {
			price = 1800;
			priceCopies = price * copies;
		}
		else if (copies >= 10 && copies <= 29) {
			price = 1500;
			priceCopies = price * copies;
		}
		else if (copies >= 30 && copies <= 49) {
			price = 1300;
			priceCopies = price * copies;
		}		 
		else if (copies >= 50 && copies <= 99) {
			price = 1300;
			priceCopies = price * copies;
		}
		else if (copies >= 100 && copies <= 199) {
			price = 1200;
			priceCopies = price * copies;
		}
		else if (copies >= 200 && copies <= 499) {
			price = 1100;
			priceCopies = price * copies;
		}
		else if (copies >= 500) {
			price = 1000;
			priceCopies = price * copies;
		}
		else{
			System.out.println("Invalid number of copies!");
		}
		return priceCopies;
	}
} 