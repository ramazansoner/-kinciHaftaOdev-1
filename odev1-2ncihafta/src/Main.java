public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Ramazan", "SONER", "rsoner0681@gmail.com");
		Student student2 = new Student();
		student2.id = 2;
		student2.firstName = "Esra";
		student2.lastName = "SONER";
		student2.email = "esra@gmail.com";

		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		studentManager.addStudent(student2);

		Instructor instructor1 = new Instructor(1, "Kemal", "SANAR", "rsoner0681@gmail.com");

		Instructor instructor2 = new Instructor();
		instructor2.id = 2;
		instructor2.firstName = "Şener";
		instructor2.lastName = "YENER";
		instructor2.email = "murat@gmail.com";

		InsructorManager insructorManager = new InsructorManager();
		insructorManager.addInstructor(instructor1);
		insructorManager.addInstructor(instructor2);

		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "21/04/2021", "Ücretsiz");
		Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "09/01/21021",
				"Ücretsiz");

		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);

		System.out.println("\n--- Kurslar ---\n");
		Course[] courses = { course1, course2 };
		courseManager.listToCourse(courses);

		System.out.println("\n--- Öğreciler --- \n");
		Student[] students = { student1, student2 };
		for (Student student : students) {
			System.out.println(student.firstName + " " + student.lastName);
		}

		System.out.println("\n--- Eğitmenler --- \n");
		Instructor[] insructorManagers = { instructor1, instructor2 };
		for (Instructor instructor : insructorManagers) {
			System.out.println(instructor.firstName + " " + instructor.lastName);
		}
	}

}
