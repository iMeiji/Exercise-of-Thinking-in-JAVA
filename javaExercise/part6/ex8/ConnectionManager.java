package ex8;

/**
 * Created by yeming on 2015/8/25.
 */
public class ConnectionManager {

    public class Connection {

        private Connection() {

        }

        public void f() {
            System.out.println("f");
        }
    }

    static Connection[] connections = new Connection[1];


    public static Connection[] getConnections() {
        return connections;
    }
}
