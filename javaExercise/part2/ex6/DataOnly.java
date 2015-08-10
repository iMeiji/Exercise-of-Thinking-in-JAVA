public class DataOnly {
    int i;
    double d;
    boolean b;

    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 1;
        dataOnly.d = 1d;
        dataOnly.b = true;
        System.out.println("dataOnly.i " + dataOnly.i);
        System.out.println("dataOnly.d " + dataOnly.d);
        System.out.println("dataOnly.b " + dataOnly.b);
        System.out.println(dataOnly.storage("Hello World"));
    }
}