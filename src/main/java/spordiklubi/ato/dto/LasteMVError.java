package spordiklubi.ato.dto;

/**
 * Created by olevabel on 7/19/16.
 */
public class LasteMVError {

    private long code;
    private String message;

    public LasteMVError(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LasteMVError{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
