public class Course {

    private int Hours;
    private char Grade;

    /*
     * Course Constructor
     */
    public Course(int hours, char grade) {

        Hours = hours;
        Grade = grade;

    }

    /*
     * Getters / Setters for Hours
     */
    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    /*
     * Getters / Setters for Grade
     */
    public char getGrade() {
        return Grade;
    }

    public void setGrade(char grade) {
        Grade = grade;
    }

    /*
     * Courses toString
     */
    public String toString() {
        return "Course [grade=" + Grade + " hours=" + Hours +"]";
    }
}
