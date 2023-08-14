package collections.trees;

public class Student {

    private final String studentName;
    private Float averageScore;

    public Student(String studentName, float averageScore) {
        this.studentName = studentName;
        this.averageScore = averageScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public Float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
}
