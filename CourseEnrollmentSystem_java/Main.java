public class Main {
    public static void main(String[] args) {
        // Test Case 1: Valid Course
        try {
            Course dsCourse = new Course("Data Structures", 12, 15000);
            dsCourse.displayCourseDetails();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test Case 2: Valid ProgrammingCourse
        try {
            ProgrammingCourse javaCourse = new ProgrammingCourse("Java Basics", 8, 12000, "Java");
            javaCourse.displayCourseDetails();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test Case 3: Invalid Duration
        try {
            ProgrammingCourse pyCourse = new ProgrammingCourse("Advanced Python", 0, 12000, "Python");
            pyCourse.displayCourseDetails();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test Case 4: Invalid Fee
        try {
            ProgrammingCourse cppCourse = new ProgrammingCourse("C++ Mastery", 8, 500, "C++");
            cppCourse.displayCourseDetails();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test Case 5: Missing Language
        try {
            ProgrammingCourse kotlinCourse = new ProgrammingCourse("Kotlin for Android", 6, 15000, "");
            kotlinCourse.displayCourseDetails();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
