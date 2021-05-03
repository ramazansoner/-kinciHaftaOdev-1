
public class CourseManager {
	public void addToCourse(Course course) {
		System.out.println(course.courseName + " Kursu eklendi");
	}

	public void deleteToCourse(Course course) {
		System.out.println(course.courseName + "  Kursu silindi");
	}

	public void updateToCourse(Course course) {
		System.out.println(course.courseName + " Kursu güncellendi");
	}

	public void listToCourse(Course[] courses) {
		for (Course course : courses) {

			System.out.println(course.id + " " + course.courseName);
		}

	}
}
