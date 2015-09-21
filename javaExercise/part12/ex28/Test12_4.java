package part12.ex28;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/16.
 */

class CustomException extends RuntimeException {

    private String errorMessage;

    public CustomException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

public class Test12_4 {

    public static void main(String[] args) {
        throw new CustomException("This is error message!");
    }
}
