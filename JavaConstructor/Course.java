package JavaConstructor;

public class Course {
    // Instance Variables
    String courseName;
    String duration;
    double fee;

    // Class Variable
    static String instituteName = "Default Institute";

    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", "3 months", 500.00);
        course1.displayCourseDetails();

        System.out.println();

        Course course2 = new Course("Web Development", "4 months", 750.00);
        course2.displayCourseDetails();

        System.out.println();

        // Update institute name for all courses
        Course.updateInstituteName("Global Tech Institute");

        System.out.println();

        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}