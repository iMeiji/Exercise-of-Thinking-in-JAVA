package part12.ex4;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/16.
 */

class CustomException extends Exception {

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
        try {
            throw new CustomException("This is error message!");
        } catch (CustomException e) {
            print(e.getErrorMessage());
        }
    }
}
