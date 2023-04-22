package block1.firstprograms.calculator;

public class ResultsOutOfBoundException extends Exception {
    public ResultsOutOfBoundException() {
        super();
    }

    public ResultsOutOfBoundException(String message) {
        super(message);
    }

    public ResultsOutOfBoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResultsOutOfBoundException(Throwable cause) {
        super(cause);
    }
}
