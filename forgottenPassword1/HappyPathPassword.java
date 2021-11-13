package forgottenPassword1;


public class HappyPathPassword {
	protected static String username;
	protected static String password;

	public HappyPathPassword(String username, String password) {
		HappyPathPassword.username = "tomsmith";
		HappyPathPassword.password = "SuperSecretPassword!";
	}

	public HappyPathPassword() {
		super();
		
	}

	public static String getUsername() {
		return username;
	}

	public static String getPassword() {
		return password;
	}

	public void stampanje() {
		switch (username) {
		case "tomsmith":
			System.out.println("PASSWORD: " + password);
			break;
		default:
			System.out.println("Pogresan USERNAME!");
			break;
		}
		switch (password) {
		case "SuperSecretPassword!":
			System.out.println("Uspesno ste ulogovani.");

			break;
		default:
			System.out.println("Pogresan PASSWORD!");
		
		}
	}
}