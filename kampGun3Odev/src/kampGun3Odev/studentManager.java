package kampGun3Odev;

public class studentManager extends userManager {
	public void joinCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Kursa kat�ld�.");
	}
	
	public void leaveCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Kurstan ayr�ld�.");
	}
}
