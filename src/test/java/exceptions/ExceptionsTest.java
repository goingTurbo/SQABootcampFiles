
package exceptions;

import java.util.Scanner;

import org.testng.annotations.Test;

/**
 * exceptionsTest //ADDD (description of class)
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
public class ExceptionsTest {

	@Test
	public void test() throws Exception {
		// if I have a throw in the code that's not in the try/catch, than I
		// need 'throws' in the made class/test/etc

		// variable to store the value from user as an int
		String input;
		int num;
		// Scanner object to get user input
		Scanner scanner = new Scanner(System.in);
		// Ask the user to enter a number
		System.out.print("Please enter a number between 50 -> 100: ");
		// set value of input to what the user enters
		input = scanner.next();
		// throw new Exception();
		// start try-catch statement to catch anything that isn't a number
		try {
			// set the num variable to the converted int value of 'input' string
			num = Integer.parseInt(input);
			if (num > 100) {
				throw new HighRangeException();
			} else if (num < 50) {
				throw new LowRangeException();
			} else if (num % 7 != 0) {
				throw new Divisor7Exception();
			} else if (num % 9 != 0) {
				throw new Divisor9Exception();
			}
			// Catch the exception which is thrown if the user does not enter a
			// number
		} catch (NumberFormatException e) {
			// What the user will see if they don't enter a number
			System.out.println("You didn't enter a valid number.");

			// This will execute because this is the parent to both high and
			// low, even though there was no throw for it
			// } catch(InvalidRangeException e) {
			// System.out.println("You didn't pick between 50-100");

		} catch (HighRangeException e) {
			System.out.println("You put a number tooooo high");
		} catch (LowRangeException e) {
			// this executes if user passes correct value
			System.out.println("You put a number toooo low");
		} catch (Divisor7Exception e) {
			System.out.println("Your number wasn't divisible by 7!");
		} catch (Divisor9Exception e) {
			System.out.println("Your number wasn't divisible by 9!");
		} finally {
			System.out.println("The 'Finally' - I WILL ALWAYS EXECUTE"); // this
																			// will
																			// always
																			// execute
		}

		// if(num > 100){
		// go high range
		// }else {
		// go low range
		// }
	}

}
