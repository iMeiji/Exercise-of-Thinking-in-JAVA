public class TwoName {

    public static void main(String[] args) {
        Text text1 = new Text();
        Text text2 = new Text();
        text1.f = 1f;
        text2.f = text1.f;
        text1.f = 2f;
        System.out.println("text1 " + text1.f + " text2 " + text2.f);

        text2 = text1;
        text1.f = 3f;
        System.out.println("text1 " + text1.f + " text2 " + text2.f);
    }
}