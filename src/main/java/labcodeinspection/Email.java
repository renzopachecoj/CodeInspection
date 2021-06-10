package labcodeinspection;

import java.util.Locale;

public class Email {

	private static String mFirstName;
	private static String mLastName;
	private static String password;
	private static String department;
	private static int defPasswordLength = 8;
	private static String email;
	
	/**
	* Initializes user.
	*/
	public Email(final String firstName, final String lastName) {
		this.mFirstName = firstName;
		this.mLastName = lastName;
	}
	/**
	* Displays user information.
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + mFirstName + "\nLAST NAME= " + mLastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	
	/**
	* Generates a department name based on a number choice.
	*/
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default: 
			this.department = "other";
			break;
		}
	}
	/**
	* Generates a random password of a set length.
	*/
	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	/**
	* Generates credentials.
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.defPasswordLength);
		this.email = this.mFirstName.toLowerCase(Locale.getDefault()) + this.mLastName.toLowerCase(Locale.getDefault()) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
