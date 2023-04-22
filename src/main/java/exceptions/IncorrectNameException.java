package exceptions;

public class IncorrectNameException extends RuntimeException {
    public IncorrectNameException() {
    }

    public IncorrectNameException(String message) {
        super(message);
    }

    public IncorrectNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectNameException(Throwable cause) {
        super(cause);
    }
}
