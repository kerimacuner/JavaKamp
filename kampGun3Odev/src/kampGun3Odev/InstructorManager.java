package kampGun3Odev;

public class InstructorManager extends userManager {
	public void shareCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " Kursu Yay�nlad�.");
	}
	
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " Kursu Sildi");
	}
}
