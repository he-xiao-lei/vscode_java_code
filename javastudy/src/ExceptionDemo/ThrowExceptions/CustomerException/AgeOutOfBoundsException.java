package ExceptionDemo.ThrowExceptions.CustomerException;

public class AgeOutOfBoundsException extends RuntimeException{
    public AgeOutOfBoundsException() {
        super();
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
