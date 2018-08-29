package share.util;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class MsgHandleResult implements Serializable {
    private static final long serialVersionUID = 7665095068222877307L;
    private String resultCode;//-1:错误；1：正确
    private String errorReason;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }
}
