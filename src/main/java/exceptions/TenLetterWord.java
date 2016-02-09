package exceptions;

import java.util.Scanner;

/**
 * TenLetterWord //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class TenLetterWord {

	private static Scanner scanner;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// boolean keepGoing = true;
		String input;
		scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Please type out a 10 letter word: ");
			try {
				input = scanner.next();
				if (input.length() >= 11) {
					throw new LongWordException();
				} else if (input.length() <= 9) {
					throw new ShortWordException();
				}
				// } catch (Exception e) {
				// System.out.println("You didn't type a word");
				// continue;
			} catch (LongWordException e) {
				System.out.println("Your word was too long.");
				continue;
			} catch (ShortWordException e) {
				System.out.println("Your word was too short");
				continue;
			}
			System.out.println("You type the correct length.  The word you typed was " + input);
			break;

		}

	}

}
