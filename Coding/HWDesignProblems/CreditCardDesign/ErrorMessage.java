package HWDesignProblems.CreditCardDesign;

public class ErrorMessage extends  IllegalArgumentException {
    private IErrorCode errorCode;

    public ErrorMessage(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
