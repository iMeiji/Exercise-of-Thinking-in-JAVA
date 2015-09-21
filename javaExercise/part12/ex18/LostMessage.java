package part12.ex18;//: exceptions/LostMessage.java
// How an exception can be lost.

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class ThirdException extends Exception {
    public String toString() {
        return "ThirdException";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } finally {
                    throw new ThirdException();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} /* Output:
A trivial exception
*///:~
