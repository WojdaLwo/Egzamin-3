package exceptions;

public class NoWomenException extends RuntimeException{

    public NoWomenException() {
    }

    public NoWomenException(String message) {
        super(message);
    }
}