public class Calculator {

    private Course[] courses;
    private PriorInfo priorInfo;

    public Calculator(Course[] courses1, PriorInfo pi) {

        priorInfo = pi;
        courses = courses1;

    }

    public int CalculateTotalHours () {
        int currentHours = 0;
        for (Course c : courses) {
            currentHours += c.getHours();
        }
        return currentHours + priorInfo.getCompletedHours();
    }

    public double CalculateTotalPoints () {
        double semesterPoints = 0;
        int coursePoints;
        for (Course c : courses) {
            if (c.getGrade() == 'A') {
                coursePoints = 4;
            } else if (c.getGrade() == 'B') {
                coursePoints = 3;
            } else if (c.getGrade() == 'C') {
                coursePoints = 2;
            } else if (c.getGrade() == 'D') {
                coursePoints = 1;
            } else {
                coursePoints = 0;
            }

            semesterPoints += (c.getHours() * coursePoints);
        }
        return (priorInfo.getCurrentPoints() + semesterPoints + 0.5);
    }

    public double CalculateGPA () {
        return CalculateTotalPoints() / CalculateTotalHours();
    }

}
