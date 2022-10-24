public class NotificationException extends IllegalArgumentException {
    private IErrorCode errorCode;

    public NotificationException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

}