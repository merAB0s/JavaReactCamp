package JavaCampIII;

public class Main {

    public static void main(String[] args) {
        Course course1= new Course();
        course1.setId(1);
        course1.setName("C#");
        course1.setInstructorName("Engin Demiro?");

        Course course2= new Course();
        course2.setId(2);
        course2.setName("java");
        course2.setInstructorName("Engin Demiro?");

        Course course3= new Course();
        course3.setId(3);
        course3.setName("Angular");
        course3.setInstructorName("Engin Demiro?");

        Course[] courses = {course1, course2, course3};

        CourseManager courseManager = new CourseManager();
        courseManager.addCourses(courses);

        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demiro?");
        instructor1.setEmail("engindemirog@gmail.com");
        instructor1.setPassword("1234");
        instructor1.setProfession("C#, Java");


        InstructorManager instructorManager=new InstructorManager();
        instructorManager.instructorInformation(instructor1);
        instructorManager.deleteCourse(course3);

        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Aysel");
        student1.setLastName("Mehmetzade");
        student1.setEmail("aysel@hotmail.com");
        student1.setPassword("1234");
        student1.setImageUrl("src/images/aysel.png");
        StudentManager studentManager = new StudentManager();
//		studentManager.updateStudent(student1);
        studentManager.add?mage(student1);
        studentManager.addUser(student1);

        User user1 = new User();
        user1.setId(1);
        user1.setFirstName("Yusuf");
        user1.setLastName("Demir");
        user1.setEmail("yusuf@hotmail.com");
        user1.setPassword("1234");
        UserManager userManager=new UserManager();
        userManager.addUser(user1);
        userManager.deleteUser(user1);


    }
}
