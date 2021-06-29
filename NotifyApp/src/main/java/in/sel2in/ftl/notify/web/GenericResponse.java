package in.sel2in.ftl.notify.web;

public class GenericResponse {

    String msg
            ;
    String errorCode;
    String errorMsg;

    public GenericResponse() {

    }

    public GenericResponse(String msg, String errorCode, String errorMsg) {
        this.msg = msg;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
