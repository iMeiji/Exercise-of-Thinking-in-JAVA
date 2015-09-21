package part12.ex30;//: exceptions/Human.java
// Catching exception hierarchies.

import static Utils.Print.*;

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

public class Human {
    static void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 1:
                    throw new Sneeze();
                case 2:
                    throw new Annoyance();
                default:
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            try {
                throwRuntimeException(i);
            } catch (RuntimeException t) {
                try {
                    throw t.getCause();
                } catch (Sneeze sneeze) {
                    print("sneeze");
                } catch (Annoyance annoyance) {
                    print("annoyance");
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        }
    }
} /* Output:
Caught Sneeze
Caught Annoyance
*///:~
