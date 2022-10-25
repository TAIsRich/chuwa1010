package CreditCardDesign;

public enum ResultCode implements IErrorCode {
    //SUCCESS(200, "操作成功"),
    FAILED( "No Valid Preference");
    //VALIDATE_FAILED(404, "参数检验失败"),
    //UNAUTHORIZED(401, "暂未登录或token已经过期"),
    //FORBIDDEN(403, "没有相关权限"),

    private String message;

    private ResultCode(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}