import java.util.Scanner;

public class LargestSmallest {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

String choice;
boolean firstInput = true;
int number = 0;
int largest = 0;
int smallest = 0;

while(true) {
System.out.print("Enter number (enter -1 to end): ");
number = input.nextInt();

if(firstInput) {
largest = number;
smallest = number;
firstInput = false;
}
else {
if(number > largest) {
largest = number;
}
if(number < smallest) {
smallest = number;
}
}
System.out.println("Do you want to enter another number: ");
choice = input.next();

if(choice == "yes") {
break;
}
}
if(firstInput) {
System.out.println("invalid! no numbers entered.");
}
else {
System.out.println("Largest number enteres: " + largest);
System.out.println("Smallest number enteres: " + smallest);
}

}
}