package three.view;

import javax.swing.JOptionPane;

public class StringView
{

	public void displayRuntimeError()
	{
		int tempNumber;
		String tempString;

		JOptionPane.showMessageDialog(null, "Let's crash the program!!!");
		tempString = JOptionPane
				.showInputDialog("Type in your favorite number!");
		tempNumber = Integer.parseInt(tempString);
		JOptionPane.showMessageDialog(null, "Your favorite number is "
				+ tempNumber);

	}

	public void usePassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, "You typed in this earlier: "
				+ currentValue);

	}

	public String sendParameterMethod()
	{
		// When using a variable in a method you must first assign it a value.
		String temp = null;

		JOptionPane.showMessageDialog(null, "Let's pass values!!!");
		temp = JOptionPane.showInputDialog("Type in your favorite words");

		return temp;

	}

	public void moreInteractive(String userName, String funnyPhrase)
	{
		JOptionPane.showMessageDialog(null,
				"Hi there, we are going to use two parameters");
		JOptionPane.showMessageDialog(null, userName + " thinks that " + "\n"
				+ funnyPhrase + " is funny");
	}

	public void testStringMethods()
	{
		// This is where we are testing our new methods

		testEndsWith();
		testSubstring();
		testToUpperCase();

	}

	private void testEndsWith()
	{

		String answer;
		boolean testValue;

		JOptionPane
				.showMessageDialog(
						null,
						"Let's try a new test!"
								+ "\n"
								+ "This will test whether or not the word you type in ends with 'pe'!");

		answer = JOptionPane.showInputDialog("Type in a word!");

		if (testValue = answer.endsWith("pe"))
		{
			testValue = true;
			JOptionPane.showMessageDialog(null, "Yes! Your word ends in 'pe'.");
		}
		else
		{
			testValue = false;
			JOptionPane.showMessageDialog(null,
					"No, your word does not end in 'pe'...");
		}

	}

	private void testSubstring()
	{

		JOptionPane.showMessageDialog(null, "Let's check out Substrings!"
				+ "\n" + "(part of a string)");

		String answer = JOptionPane
				.showInputDialog("Type in a word/phrase that is at least 8 characters long");

		JOptionPane
				.showMessageDialog(null, "This is what you typed: " + answer);

		String temp = answer.substring(0, 7);

		JOptionPane.showMessageDialog(null,
				"Now here is the first 7 characters of what you typed: " + temp);
	}

	private void testToUpperCase()
	{

		JOptionPane
				.showMessageDialog(null, "Let's make everything UPPER CASE!");
		String answer = JOptionPane
				.showInputDialog("Type in a word in lower case");

		String newAnswer = answer.toUpperCase();

		JOptionPane
				.showMessageDialog(null, "This is what you typed: " + answer);

		JOptionPane.showMessageDialog(null,
				"Now this is what you typed but all of the letters are now Upper Case: "
						+ newAnswer);

	}
}
