public class Course {
    private String courseName;
    private int durationInWeeks;
    private double fee;

    public Course(String courseName, int durationInWeeks, double fee)
            throws InvalidCourseDurationException, InvalidCourseFeeException {
        this.courseName = courseName;
        setDurationInWeeks(durationInWeeks);
        setFee(fee);
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }
    public void setDurationInWeeks(int durationInWeeks) throws InvalidCourseDurationException {
        if (durationInWeeks < 1 || durationInWeeks > 52) {
            throw new InvalidCourseDurationException("Duration must be between 1 and 52 weeks.");
        }
        this.durationInWeeks = durationInWeeks;
    }

    public double getFee() {
        return fee;
    }
    public void setFee(double fee) throws InvalidCourseFeeException {
        if (fee < 1000 || fee > 100000) {
            throw new InvalidCourseFeeException("Fee must be between 1000 and 100000.");
        }
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration (weeks): " + durationInWeeks);
        System.out.println("Fee: " + fee);
    }
}
