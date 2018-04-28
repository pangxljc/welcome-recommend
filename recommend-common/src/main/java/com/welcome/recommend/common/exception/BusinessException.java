package com.welcome.recommend.common.exception;

public class BusinessException extends Exception{
    static final long serialVersionUID = -35466L;
    private String hint;
    private String errorCodeString = "";

    public BusinessException(){

    }

    public BusinessException(String hint){
        super(hint);
        setErrorCodeString("-32000");
    }

    public BusinessException(String hint,String errorCodeString){
        super(hint);
        setErrorCodeString(errorCodeString);
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getErrorCodeString() {
        return errorCodeString;
    }

    public void setErrorCodeString(String errorCodeString) {
        this.errorCodeString = errorCodeString;
    }
}
