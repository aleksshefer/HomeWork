package collections.trees;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ResultsBoard {
    private final TreeSet<Student> studentsSortedByIncreaseScore;

    public ResultsBoard() {
        studentsSortedByIncreaseScore = new TreeSet<>(Comparator.comparing(Student::getAverageScore));
    }

    void addStudent(String name, Float score) {
        studentsSortedByIncreaseScore.add(new Student(name, score));
    }

    List<String> top3() {
        List<String> top3StudentsByScore = new ArrayList<>(3);

        for (int i = 0; i < 3; i++) {
            top3StudentsByScore.add(studentsSortedByIncreaseScore
                    .pollLast()
                    .getStudentName());
        }
        return top3StudentsByScore;
    }
}
