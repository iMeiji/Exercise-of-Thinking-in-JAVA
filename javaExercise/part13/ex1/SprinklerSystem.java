package part13.ex1;//: reusing/SprinklerSystem.java
// Composition for code reuse.

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString() {
        return new StringBuilder("valve1 = ")
                .append(valve1)
                .append("valve2 = ")
                .append(valve2)
                .append("valve3 = ")
                .append(valve3)
                .append("valve4 = ")
                .append(valve4)
                .append("\n")
                .append("i = ")
                .append(i)
                .append(" f = ")
                .append("f")
                .append(" source = ")
                .append(source).toString();
//                "valve1 = " + valve1 + " " +
//                        "valve2 = " + valve2 + " " +
//                        "valve3 = " + valve3 + " " +
//                        "valve4 = " + valve4 + "\n" +
//                        "i = " + i + " " + "f = " + f + " " +
//                        "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
} /* Output:
WaterSource()
valve1 = null valve2 = null valve3 = null valve4 = null
i = 0 f = 0.0 source = Constructed
*///:~
