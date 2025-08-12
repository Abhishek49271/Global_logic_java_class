public class ProgrammingCourse extends Course {
    private String language;

    public ProgrammingCourse(String courseName, int durationInWeeks, double fee, String language)
            throws InvalidCourseDurationException, InvalidCourseFeeException, InvalidProgrammingLanguageException {
        super(courseName, durationInWeeks, fee);
        setLanguage(language);
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) throws InvalidProgrammingLanguageException {
        if (language == null || language.trim().isEmpty()) {
            throw new InvalidProgrammingLanguageException("Programming language cannot be null or empty.");
        }
        this.language = language;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Programming Language: " + language);
    }
}
