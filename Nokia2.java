import java.util.Scanner;

public class Nokia2 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

while (true) {

System.out.print("""
	
	Main menu

	1. Phone book
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. SIM services
""");
System.out.println("	press 99 to Exit.");
int choice = input.nextInt();

if(choice == 99) {
System.out.print("Exiting... Goodbye!");
break;
}

switch (choice) {
	case 1: { 
		boolean phoneBook = true;
		while (phoneBook) {
		System.out.print("""

			Phone book

			1. Search
			2. Service Nos.
			3. Add name
			4. Erase
			5. Edit
			6. Assign tone
			7. Send b'card
			8. Options
			9. Speed dials
			10. Voice tags
			0. Back to Main menu
		""");
		int phoneBookChoice = input.nextInt();
		switch(phoneBookChoice) {
			case 1: System.out.print("""

					Search

				0. Back to Main menu

				""");
				phoneBookChoice = input.nextInt();
			break;
			case 2: System.out.print("""

					Service Nos.

				0. Back to Main menu

				""");
				phoneBookChoice = input.nextInt();
			break;
			case 3: System.out.print("""

					Add name

				0. Back to Main menu

				""");
				phoneBookChoice = input.nextInt();
			break;
			case 4: System.out.print("""

					Erase

				0. Back to Main menu

				""");
				phoneBookChoice = input.nextInt();
			break;
			case 5: System.out.print("""

					Edit

				0. Back to Main menu

				""");
				phoneBookChoice = input.nextInt();
			break;
			case 6: System.out.print("""

					Assign tone

				0. Back to Main menu

				""");
				phoneBookChoice = input.nextInt();
			break;
			case 7: System.out.print("""

					Send b'card

				0. Back to Main menu

				""");
				phoneBookChoice = input.nextInt();
			break;
			case 8: {
					boolean options = true;
					while (options) {
					System.out.print("""
					
					Options

					1. Type of view
					2. Memory status

				""");
					int optionsChoice = input.nextInt();
					switch(optionsChoice) {
						case 1: System.out.print("""

								Type of view

							press any number to go back
							""");
							optionsChoice = input.nextInt();
						break;
						case 2: System.out.print("""

								Memory status

							press any number to go back
							""");
							optionsChoice = input.nextInt();
						break;
						case 0: options = false;
						break;
						default: System.out.println("Invalid number, try again");
					}

}

			break;
}
			case 9: System.out.print("""

					Speed dials

				""");
				phoneBookChoice = input.nextInt();
			break;
			case 10: System.out.print("""

					Voice tags

				""");
				phoneBookChoice = input.nextInt();
			break;
			case 0: phoneBook = false;
			break;
			default: System.out.println("Invalid number, try again");

			}
	}
	break;

	}

	case 2: {
		boolean message = true;
		while(message) {
		System.out.print("""
		
			Message

			1. Write messages
			2. Inbox
			3. Outbox
			4. Picture messages
			5. Templates
			6. Smileys
			7. Message settings
			8. Info Services
			9. Voice mailbox number
			10. Service command editor
			0. Back Main menu
		""");
			int messageChoice = input.nextInt();
			switch(messageChoice) {
				case 1: System.out.print("""

						Write messages

					press any number to go back
					""");
					messageChoice = input.nextInt();
				break;
				case 2: System.out.print("""

						Inbox
					
					press any number to go back
					""");
					messageChoice = input.nextInt();
				break;
				case 3: System.out.print("""

						Outbox

					press any number to go back
					""");
					messageChoice = input.nextInt();
				break;
				case 4: System.out.print("""

						Picture messages
	
					press any number to go back
					""");
					messageChoice = input.nextInt();
				break;
				case 5: System.out.print("""

						Templates

					press any number to go back
					""");
					messageChoice = input.nextInt();
				break;
				case 6: System.out.print("""

						Smileys

					press any number to go back	
					""");
					messageChoice = input.nextInt();
				break;
				case 7: {
					boolean messageSetting = true;
					while (messageSetting) {
					System.out.print("""

						Message settings

						1. Set 1
						2. Common
					""");	
					int messageSettingChoice = input.nextInt();
					switch(messageSettingChoice) {
						case 1: {
							boolean set1 = true;
							while (set1) {
							System.out.print("""

								Set 1

								1. Message centre number
								2. Message sent as
								3. Message validity
							""");
							int set1Choice = input.nextInt();
							switch(set1Choice) {
								case 1: System.out.print("""

										Message center number

									""");
									set1Choice = input.nextInt();
								break;
								case 2: System.out.print("""

										Message sent as

									""");
									set1Choice = input.nextInt();
								break;
								case 3: System.out.print("""

										Message validity

									""");
									set1Choice = input.nextInt();
								break;
								case 0: set1 = false;
								break;
								default: System.out.println("Invalid number, try again");
								}

}
}
						break;
						case 2: {
							boolean common = true;
							while (common) {
							System.out.print("""

								Common

								1. Delivery reports
								2. Reply via same centre
								3. Character support
							""");
							int commonChoice = input.nextInt();
							switch(commonChoice) {
								case 1: System.out.print("""

										Delivery reports

									""");
									commonChoice  = input.nextInt();
								break;
								case 2: System.out.print("""

										Reply via same centre

									""");
									commonChoice  = input.nextInt();
								break;
								case 3: System.out.print("""

										Character support

									""");
									commonChoice  = input.nextInt();
								break;
								case 0: common = false;
								break;
								default: System.out.println("Invalid number, try again");
							}
							break;

}
}
						}

}

}
				break;
				case 8: System.out.print("""

						Info services
				
					""");
					messageChoice = input.nextInt();
				break;
				case 9: System.out.print("""

						Voice mailbox number
	
					""");
					messageChoice = input.nextInt();
				break;
				case 10: System.out.print("""

						Service Command editor
	
					""");
					messageChoice = input.nextInt();
				break;
				case 0: message = false;
				break;
				default: System.out.print("Invalid number, try again");
			}
	break;
	
		}

}
	case 3: System.out.print("""
				Chat

			0. Back to Main menu

		""");
		int chatChoice = input.nextInt();
	break;
	case 4: {
		boolean callRegister = true;
		while (callRegister) {
		System.out.print("""

			Call register

			1. Missed calls
			2. Received calls
			3. Dialled numbers
			4. Erase recent call lists
			5. Show call duration
			6. Show call costs
			7. Call cost settings
			8. Prepaid credit
			0. Back to Main menu

		""");
		int callRegisterChoice = input.nextInt();
		switch(callRegisterChoice) {
			case 1: System.out.print("""

					Missed calls

				0. Back to Main menu

				""");
				callRegisterChoice = input.nextInt();
			break;
			case 2: System.out.print("""

					Received calls

				0. Back to Main menu

				""");
				callRegisterChoice = input.nextInt();
			break;
			case 3: System.out.print("""

					Dialled numbers

				""");
				callRegisterChoice = input.nextInt();
			break;
			case 4: System.out.print("""

					Erase recent call lists

				""");
				callRegisterChoice = input.nextInt();
			break;
			case 5: {
				boolean callDuration = true;
				while(callDuration) {
				System.out.print("""
		
					Show call duration
				
					1. Last call duration
					2. All calls' duration
					3. Received calls' duration
					4. Dialled calls' duration
					5. Clear timers
				""");
				int callDurationChoice = input.nextInt();
				switch(callDurationChoice) {
					case 1: System.out.print("""

							Last call duration

						""");
						callDurationChoice = input.nextInt();
					break;
					case 2: System.out.print("""

							All calls' duration

						""");
						callDurationChoice = input.nextInt();
					break;
					case 3: System.out.print("""

							Received calls' duration

						""");
						callDurationChoice = input.nextInt();
					break;
					case 4: System.out.print("""

							Dialled calls' duration
	
						""");
						callDurationChoice = input.nextInt();
					break;
					case 5: System.out.print("""

							Clear timers

						""");
						callDurationChoice = input.nextInt();
					break;
					case 0: callDuration = false;
					break;
					default: System.out.print("Invalid number, try again");
				}

}
}
			break;
			case 6: {
				boolean callCost = true;
				while (callCost) {
				System.out.print("""
				
					Show call costs

					1. Last call cost
					2. All calls' cost
					3. Clear counters

				""");
				int callCostChoice = input.nextInt();
				switch(callCostChoice) {
					case 1: System.out.print("""

							Last call cost

						""");
						callCostChoice = input.nextInt();
					break;
					case 2: System.out.print("""

							All calls' cost

						""");
						callCostChoice = input.nextInt();
					break;
					case 3: System.out.print("""

							Clear counters
	
						""");
						callCostChoice = input.nextInt();
					break;
					case 0: callCost = false;
					break;
					default: System.out.print("Invalid number, try again");
				}

}
}
			break;
			case 7: {
				boolean costSetting = true;
				while (costSetting) {
				System.out.print("""

					Call cost settings
				
					1. Call cost limit
					2. Show costs in

				""");
				int callSettingChoice = input.nextInt();
				switch(callSettingChoice) {
					case 1: System.out.print("""

							Call cost limit

						""");
						callSettingChoice = input.nextInt();
					break;
					case 2: System.out.print("""

							Show costs in

						""");
						callSettingChoice = input.nextInt();
					break;
					case 0: costSetting = false;
					break;
					default: System.out.print("Invalid number, try again");
				}

}
}
			break;
			case 8: System.out.print("""

					Prepaid credit

				""");
				callRegisterChoice = input.nextInt();
			break;
			case 0: callRegister = false;
			default: System.out.println("invalid number, try again");

}
}
		}
	break;

	
	case 5: {
		boolean tones = true;
		while (tones) {

		System.out.print("""

			Tones

			1. Ringing tone
			2. Ringing Volume
			3. Incoming call alert
			4. Composer
			5. Message alert tone
			6. Keypad tones
			7. Warning and game tones
			8. Vibrating alert
			9. Screen saver
			0. Back to Main menu

		""");
		int toneChoice = input.nextInt();
		switch(toneChoice) {
			case 1: System.out.print("""

					Ringing tone

				""");
				toneChoice = input.nextInt();
			break;
			case 2: System.out.print("""

					Ringing volume

				""");
				toneChoice = input.nextInt();
			break;
			case 3: System.out.print("""

					Incoming call alert

				""");
				toneChoice = input.nextInt();
			break;
			case 4: System.out.print("""

					Composer

				""");
				toneChoice = input.nextInt();
			break;
			case 5: System.out.print("""

					Message alert tone

				""");
				toneChoice = input.nextInt();
			break;
			case 6: System.out.print("""

					Keypad tones

				""");
				toneChoice = input.nextInt();
			break;
			case 7: System.out.print("""

					Warning and game tones

				""");
				toneChoice = input.nextInt();
			break;
			case 8: System.out.print("""

					Vibrating alert

				""");
				toneChoice = input.nextInt();
			break;
			case 9: System.out.print("""

					Screen saver

				""");
				toneChoice = input.nextInt();
			break;
			case 0: tones = false;
			break;
			default: System.out.println("Invalid number, try again");
		}

}
}

	break;
	
	case 6: {
		boolean settings = true;
		while (settings) {
		System.out.print("""

			Settings

			1. Call settings
			2. Phone settings
			3. Security settings
			4. Restore factory settings
			0. Back to Main menu

		""");
		int settingChoice = input.nextInt();
		switch(settingChoice) {
			case 1: {
				boolean callSetting = true;
				while(callSetting) {

				System.out.print("""

					Call settings

					1. Automatic redial
					2. Speed dialling
					3. Call waiting options
					4. Own number sending
					5. Phone line in use
					6. Automatic answer
				""");
				int callSettingChoice = input.nextInt();
				switch(callSettingChoice) {
					case 1: System.out.print("""

							Automatic redial

						""");
						callSettingChoice = input.nextInt();
					break;
					case 2: System.out.print("""

							Speed dialling

						""");
						callSettingChoice = input.nextInt();
					break;	
					case 3: System.out.print("""

							Call waiting options

						""");
						callSettingChoice = input.nextInt();
					break;
					case 4: System.out.print("""

							Own number sending

						""");
						callSettingChoice = input.nextInt();
					break;	
					case 5: System.out.print("""
	
							Phone line in use

						""");
						callSettingChoice = input.nextInt();
					break;
					case 6: System.out.print("""

							Automatic answer

						""");
						callSettingChoice = input.nextInt();
					break;
					case 0: callSetting = false;
					break;
					default: System.out.println("Invalid number, try again");
				}


}
}

			break;
			case 2: {
				boolean phoneSetting = true;
				while (phoneSetting) {
				System.out.print("""
			
					Phone settings	

					1. Language
					2. Cell info display
					3. Welcome note
					4. Network selection
					5. Lights
					6. Confirm SIM service actions
				""");

				int phoneSettingChoice = input.nextInt();
				switch(phoneSettingChoice) {
					case 1: System.out.print("""

							Language

						""");
						phoneSettingChoice = input.nextInt();
					break;
					case 2: System.out.print("""

							Cell info display

						""");
						phoneSettingChoice = input.nextInt();
					break;
					case 3: System.out.print("""

							Welcome note

						""");
						phoneSettingChoice = input.nextInt();
					break;
					case 4: System.out.print("""

							Network selection

						""");
						phoneSettingChoice = input.nextInt();
					break;
					case 5: System.out.print("""

							Lights

						""");
						phoneSettingChoice = input.nextInt();
					break;
					case 6: System.out.print("""

							Confirm SIM service actions

						""");
						phoneSettingChoice = input.nextInt();
					break;
					case 0: phoneSetting = false;
					break;
					default: System.out.println("Invalid number, try again");
					}

}
}

			break;
			case 3: {
				boolean security = true;
				while (security) {
				System.out.print("""
			
					Security settings

					1. PIN code request
					2. Call barring service
					3. Fixed dialling
					4. Closed user group
					5. Phone security
					6. Change access codes
				""");

				int securityChoice = input.nextInt();
				switch(securityChoice) {
					case 1: System.out.print("""

							PIN code request

						""");
						securityChoice = input.nextInt();
					break;
					case 2: System.out.print("""

							Call barring service

						""");
						securityChoice = input.nextInt();
					break;
					case 3: System.out.print("""

							Fixed dialling

						""");
						securityChoice = input.nextInt();
					break;
					case 4: System.out.print("""

							Closed user group

						""");
						securityChoice = input.nextInt();
					break;
					case 5: System.out.print("""

							Phone security
	
						""");
						securityChoice = input.nextInt();
					break;
					case 6: System.out.print("""

							Change access codes

						""");
						securityChoice = input.nextInt();
					break;
					case 0: security = false;
					break;
					default: System.out.println("Invalid number, try again");
				}

}
}

			break;
			case 4: System.out.print("""

					Restore factory settings

				""");
				settingChoice = input.nextInt();
			break;
			case 0: settings = false;
			break;
			default: System.out.println("Invalid number, try again");
		}


}
}

	break;
	case 7: System.out.print("""

			Call divert

			0. Back to Main menu

		""");
		int callDivertChoice = input.nextInt();
	break;
	case 8: System.out.print("""

			Games

			0. Back to Main menu

		""");
		int gamesChoice = input.nextInt();
	break;
	case 9: System.out.print("""

			Calculator

			0. Back to Main menu

		""");
		int calculatorChoice = input.nextInt();
	break;
	case 10: System.out.print("""

			Reminders

			0. Back to Main menu

		""");
		int remindersChoice = input.nextInt();
	break;
	case 11:{
		boolean clock = true;
		while (clock) {
		System.out.print("""

			Clock

			1. Alarm clock
			2. Clock settings
			3. Date setting
			4. Stopwatch
			5. Countdown timer
			6. Auto update of date and time
			0. Back to Main menu

		""");
		int clockChoice = input.nextInt();
		switch(clockChoice) {
			case 1: System.out.print("""

					Alarm clock

				""");
				clockChoice = input.nextInt();
			break;
			case 2: System.out.print("""

					Clock settings

				""");
				clockChoice = input.nextInt();
			break;
			case 3: System.out.print("""

					Date setting

				""");
				clockChoice = input.nextInt();
			break;
			case 4: System.out.print("""

					Stopwatch
	
				""");
				clockChoice = input.nextInt();
			break;
			case 5: System.out.print("""

					Countdown timer

				""");
				clockChoice = input.nextInt();
			break;
			case 6: System.out.print("""

					Auto update of date and time

				""");
				clockChoice = input.nextInt();
			break;
			case 0: clock = false;
			break;
			default: System.out.println("Invalid number, try again");
		}

}
}

		
	break;
	case 12: System.out.print("""

			Profiles

			0. Back to Main menu

		""");
		int profileChoice = input.nextInt();
	break;
	case 13: System.out.print("""

			SIM services

			0. Back to Main menu

		""");
		int simChoice = input.nextInt();
	break;
	default: System.out.println("Invalid number, try again.");

}




}

}

}