package kampGun3Odev;

public class Instructor extends User {
	//Eðitmen
	
	int numberOfStudent;

	public Instructor(int id, String firstName, String lastName, String email, int numberOfStudent) {
		super(id, firstName, lastName, email);
		this.numberOfStudent = numberOfStudent;
	}

}
