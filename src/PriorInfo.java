public class PriorInfo {

    private int CompletedHours;
    private double CurrentGPA;
    private int currentPoints;

    /*
     * Constructor
     */
    public PriorInfo(double currentGPA, int completedHours) {

        CurrentGPA = currentGPA;
        CompletedHours = completedHours;
        currentPoints = (int)(CurrentGPA * CompletedHours + 0.5);

    }

    /*
     * Getters / Setters for Current GPA
     */
    public double getCurrentGPA() {
        return CurrentGPA;
    }

    public void setCurrentGPA(double currentGPA) {
        CurrentGPA = currentGPA;
    }

    /*
     * Getters / Setters for Completed Hours
     */
    public int getCompletedHours() {
        return CompletedHours;
    }

    public void setCompletedHours(int completedHours) {
        CompletedHours = completedHours;
    }

    /*
     * Getter for currentPoints
     */
    public int getCurrentPoints() {
        return currentPoints;
    }
}
