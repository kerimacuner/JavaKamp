package kampGun3Odev;

public class Instructor extends User {
	//E�itmen
	
	int numberOfStudent;

	public Instructor(int id, String firstName, String lastName, String email, int numberOfStudent) {
		super(id, firstName, lastName, email);
		this.numberOfStudent = numberOfStudent;
	}

}
