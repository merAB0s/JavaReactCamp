package JavaCampIII;

public class CourseManager {
    public void addCourse(Course course) {
        System.out.println("Kurs eklendi: " + course.getName());
    }

    public void addCourses(Course[] courses) {
        for (Course course : courses) {
            addCourse(course);
        }
    }

    public void finishAndContinue() {
        System.out.println("Bitir ve devam et butonu");
    }
}
