package kampGun3Odev;

public class userManager {
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Giri� Yapt�.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ��k�� Yapt�.");
	}
	
	public void comment(User user) {
		System.out.println(user.getFirstName() + " Yorum Yapt�.");
	}
}
