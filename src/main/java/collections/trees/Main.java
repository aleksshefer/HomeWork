package collections.trees;

public class Main {
    public static void main(String[] args) {
        ResultsBoard resultsBoard = new ResultsBoard();

        resultsBoard.addStudent("Name1", 2.5f);
        resultsBoard.addStudent("Name2", 3.1f);
        resultsBoard.addStudent("Name3", 4.2f);     //#3
        resultsBoard.addStudent("Name4", 5.0f);     //#1
        resultsBoard.addStudent("Name5", 4.9f);     //#2
        resultsBoard.addStudent("Name6", 2.8f);
        resultsBoard.addStudent("Name7", 3.3f);
        resultsBoard.addStudent("Name8", 1.5f);
        resultsBoard.addStudent("Name9", 2.9f);
        resultsBoard.addStudent("Name10", 3.7f);


        System.out.println(resultsBoard.top3());                //Name4, Name5, Name3
    }
}
