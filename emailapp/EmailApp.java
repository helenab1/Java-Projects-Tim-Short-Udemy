package emailapp;
/*
 * Email Application for creating email accounts for new hires within a company. This program will:
 * 1. Generate an email with the following syntax: firstname.lastname@department.company.com;
 * 2. Determine the department (sales, development, accounting), if none leave blank;
 * 3. Generate a random String for a password;
 * 4. Have set methods to change the password, set the mailbox capacity, and define an alternate email address;
 * 5. Have get  methods to display the name, email, and mailbox capacity.
 * (from Udemy's Practice Java by Building Projects course by Tim Short.)
 */

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		System.out.println(em1.showInfo());
	}

}
