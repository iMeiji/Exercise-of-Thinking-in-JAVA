package ex16;

/**
 * Created by yeming on 2015/9/2.
 */
class AlertStatus {
    public void f() {

    }
}


class Warning extends AlertStatus {

}

class Hint extends AlertStatus {

}

class Error extends AlertStatus {

}

class StarsShip {
    AlertStatus alertStatus;

    public StarsShip(AlertStatus alertStatus) {
        this.alertStatus = alertStatus;
    }

    public void f() {
        alertStatus.f();
    }

}


public class ShipDemo {

    public static void main(String[] args) {
        Warning warning = new Warning();
        Hint hint = new Hint();
        Error error = new Error();
        StarsShip starsShip = new StarsShip(warning);
        starsShip.f();
    }

}
