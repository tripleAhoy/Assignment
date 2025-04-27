import java.util.Scanner;

public class Nokia {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);


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

int choice = input.nextInt();

switch (choice) {
	case 1: {

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
		""");
		int subChoice = input.nextInt();
		switch(subChoice) {
			case 1: System.out.print("""

					Search

				""");
			break;
			case 2: System.out.print("""

					Service Nos.

				""");
			break;
			case 3: System.out.print("""

					Add name

				""");
			break;
			case 4: System.out.print("""

					Erase

				""");
			break;
			case 5: System.out.print("""

					Edit

				""");
			break;
			case 6: System.out.print("""

					Assign tone

				""");
			break;
			case 7: System.out.print("""

					Send b'card

				""");
			break;
			case 8: System.out.print("""

					1. Type of view
					2. Memory status

				""");
					subChoice = input.nextInt();
					switch(subChoice) {
						case 1: System.out.print("""

								Type of view

							""");
						break;
						case 2: System.out.print("""

								Memory status

							""");
						break;
					}
			break;
			case 9: System.out.print("""

					Speed dials

				""");
			break;
			case 10: System.out.print("""

					Voice tags

				""");
			break;
		}
	break;


	}
	case 2: {

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
		""");
			int subChoice = input.nextInt();
			switch(subChoice) {
				case 1: System.out.print("""

						Write messages

					""");
				break;
				case 2: System.out.print("""

						Inbox

					""");
				break;
				case 3: System.out.print("""

						Outbox

					""");
				break;
				case 4: System.out.print("""

						Picture messages
	
					""");
				break;
				case 5: System.out.print("""

						Templates

					""");
				break;
				case 6: System.out.print("""

						Smileys
	
					""");
				break;
				case 7: System.out.print("""

						Message settings

						1. Set 1
						2. Common
					""");		
						subChoice = input.nextInt();
						switch(subChoice) {
							case 1: System.out.print("""

									Set 1

									1. Message centre number
									2. Message sent as
									3. Message validity
								""");
									subChoice = input.nextInt();
									switch(subChoice) {
										case 1: System.out.print("""

												Message center number

											""");
										break;
										case 2: System.out.print("""

												Message sent as

											""");
										break;
										case 3: System.out.print("""

												Message validity

											""");
										break;
									}
							break;
							case 2: System.out.print("""

									Common

									1. Delivery reports
									2. Reply via same centre
									3. Character support
								""");

									subChoice = input.nextInt();
									switch(subChoice) {
										case 1: System.out.print("""

												Delivery reports

											""");
										break;
										case 2: System.out.print("""

												Reply via same centre

											""");
										break;
										case 3: System.out.print("""

												Character support

											""");
										break;
									}
							break;
						}
					break;
					case 8: System.out.print("""

							Info services
				
						""");
					break;
					case 9: System.out.print("""

							Voice mailbox number
	
						""");
					break;
					case 10: System.out.print("""

							Service Command editor
	
						""");
					break;
				}
			break;
	
		}
		case 3: System.out.print("""
				Chat
			""");
		break;
		case 4: System.out.print("""

				Call register

				1. Missed calls
				2. Received calls
				3. Dialled numbers
				4. Erase recent call lists
				5. Show call duration
				6. Show call costs
				7. Call cost settings
				8. Prepaid credit
			""");
				int subChoice = input.nextInt();
				switch(subChoice) {
					case 1: System.out.print("""

							Missed calls

						""");
					break;
					case 2: System.out.print("""

							Received calls

						""");
					break;
					case 3: System.out.print("""

							Dialled numbers

						""");
					break;
					case 4: System.out.print("""

							Erase recent call lists

						""");
					break;
					case 5: System.out.print("""
		
							Show call duration
				
							1. Last call duration
							2. All calls' duration
							3. Received calls' duration
							4. Dialled calls' duration
							5. Clear timers
						""");
							subChoice = input.nextInt();
							switch(subChoice) {
								case 1: System.out.print("""

										Last call duration

									""");
								break;
								case 2: System.out.print("""

										All calls' duration

									""");
								break;
								case 3: System.out.print("""

										Received calls' duration

									""");
								break;
								case 4: System.out.print("""

										Dialled calls' duration
	
									""");
								break;
								case 5: System.out.print("""

										Clear timers

									""");
								break;
							}
						break;
						case 6: System.out.print("""
				
								Show call costs

								1. Last call cost
								2. All calls' cost
								3. Clear counters
							""");
								subChoice = input.nextInt();
								switch(subChoice) {
									case 1: System.out.print("""

											Last call cost

										""");
									break;
									case 2: System.out.print("""

											All calls' cost

										""");
									break;
									case 3: System.out.print("""

											Clear counters
	
										""");
									break;
								}
						break;
						case 7: System.out.print("""

								Call cost settings
				
								1. Call cost limit
								2. Show costs in
							""");
								subChoice = input.nextInt();
								switch(subChoice) {
									case 1: System.out.print("""

											Call cost limit

										""");
									break;
									case 2: System.out.print("""

											Show costs in

										""");
									break;
								}
						break;
						case 8: System.out.print("""

								Prepaid credit

							""");
						break;
					}
				break;

	
				case 5: System.out.print("""

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
					""");
						subChoice = input.nextInt();
						switch(subChoice) {
							case 1: System.out.print("""

									Ringing tone

								""");
							break;
							case 2: System.out.print("""

									Ringing volume

								""");
							break;
							case 3: System.out.print("""

									Incoming call alert

								""");
							break;
							case 4: System.out.print("""

									Composer

								""");
							break;
							case 5: System.out.print("""

									Message alert tone

								""");
							break;
							case 6: System.out.print("""

									Keypad tones

								""");
							break;
							case 7: System.out.print("""

									Warning and game tones

								""");
							break;
							case 8: System.out.print("""

									Vibrating alert

								""");
							break;
							case 9: System.out.print("""

									Screen saver

								""");
							break;
						}

					break;
	
					case 6: System.out.print("""

							Settings

							1. Call settings
							2. Phone settings
							3. Security settings
							4. Restore factory settings
						""");
							subChoice = input.nextInt();
							switch(subChoice) {
								case 1: System.out.print("""

										Call settings

										1. Automatic redial
										2. Speed dialling
										3. Call waiting options
										4. Own number sending
										5. Phone line in use
										6. Automatic answer
									""");
										subChoice = input.nextInt();
										switch(subChoice) {
											case 1: System.out.print("""

													Automatic redial

												""");
											break;
											case 2: System.out.print("""

													Speed dialling

												""");
											break;	
											case 3: System.out.print("""

													Call waiting options

												""");
											break;
											case 4: System.out.print("""

													Own number sending

												""");
											break;	
											case 5: System.out.print("""
	
													Phone line in use

												""");
											break;
											case 6: System.out.print("""

													Automatic answer

												""");
											break;

										}

									break;
									case 2: System.out.print("""
			
											Phone settings	

											1. Language
											2. Cell info display
											3. Welcome note
											4. Network selection
											5. Lights
											6. Confirm SIM service actions
										""");

											subChoice = input.nextInt();
											switch(subChoice) {
												case 1: System.out.print("""

														Language

													""");
													break;
												case 2: System.out.print("""

														Cell info display

													""");
												break;
												case 3: System.out.print("""

														Welcome note

													""");
												break;
												case 4: System.out.print("""

														Network selection

													""");
												break;
												case 5: System.out.print("""

														Lights

													""");
												break;
												case 6: System.out.print("""

														Confirm SIM service actions

													""");
												break;

											}

									break;
									case 3: System.out.print("""
			
											Security settings

											1. PIN code request
											2. Call barring service
											3. Fixed dialling
											4. Closed user group
											5. Phone security
											6. Change access codes
										""");

											subChoice = input.nextInt();
											switch(subChoice) {
												case 1: System.out.print("""

														PIN code request

													""");
												break;
												case 2: System.out.print("""

														Call barring service

													""");
												break;
												case 3: System.out.print("""

														Fixed dialling

													""");
												break;
												case 4: System.out.print("""

														Closed user group

													""");
												break;
												case 5: System.out.print("""

														Phone security
	
													""");
												break;
												case 6: System.out.print("""

														Change access codes

													""");
												break;

											}

									break;
									case 4: System.out.print("""

											Restore factory settings

										""");
									break;
								}

						break;
						case 7: System.out.print("""

								Call divert

							""");
						break;
						case 8: System.out.print("""

								Games

							""");
						break;
						case 9: System.out.print("""

								Calculator

							""");
						break;
						case 10: System.out.print("""

								Reminders

							""");
						break;
						case 11: System.out.print("""

								Clock

								1. Alarm clock
								2. Clock settings
								3. Date setting
								4. Stopwatch
								5. Countdown timer
								6. Auto update of date and time
							""");
								subChoice = input.nextInt();
								switch(subChoice) {
									case 1: System.out.print("""

											Alarm clock

										""");
									break;
									case 2: System.out.print("""

											Clock settings

										""");
									break;
									case 3: System.out.print("""

											Date setting

										""");
									break;
									case 4: System.out.print("""

											Stopwatch
	
										""");
									break;
									case 5: System.out.print("""

											Countdown timer

										""");
									break;
									case 6: System.out.print("""

											Auto update of date and time

										""");
									break;

								}
		
						break;
						case 12: System.out.print("""

								Profiles

							""");
						break;
						case 13: System.out.print("""

								SIM services

							""");
						break;
						default: System.out.println("Invalid number, try again.");
}


}

}