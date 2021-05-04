package kampGun3Odev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor user1 = new Instructor(1, "Engin", "Demirog", "engin@hotmail.com", 100);
		Student user2 = new Student(2, "Ali", "Keskin", "akeskin@gmail.com", 3);
		
		userManager uManager = new userManager();
		uManager.login(user1);
		uManager.login(user2);
		
		uManager.comment(user2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.shareCourse(user1);
		
		studentManager stdntManager = new studentManager();
		stdntManager.joinCourse(user2);

	}

}
