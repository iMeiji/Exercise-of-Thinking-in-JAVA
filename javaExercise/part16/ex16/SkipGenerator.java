package javaExercise.part16.ex16;

import net.mindview.util.Generator;

/**
 * Created by yeming on 2015/10/22.
 */
public class SkipGenerator {
    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean value;
        private boolean step;

        public Boolean(boolean step) {
            this.step = step;
        }

        public java.lang.Boolean next() {
            value = step ? !value : value; // Just flips back and forth
            return value;
        }
    }

    public static class Byte implements Generator<java.lang.Byte> {
        private byte value = 0;
        private byte step;

        public Byte(byte step) {
            this.step = step;
        }

        public java.lang.Byte next() {
            value += step;
            return value;
        }
    }

    static char[] chars = ("abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

    public static class
            Character implements Generator<java.lang.Character> {
        int index = -1;

        public java.lang.Character next() {
            index = (index + 1) % chars.length;
            return chars[index];
        }
    }

    public static class String implements Generator<java.lang.String> {
        private int length = 7;
        Generator<java.lang.Character> cg = new Character();

        public String() {
        }

        public String(int length) {
            this.length = length;
        }

        public java.lang.String next() {
            char[] buf = new char[length];
            for (int i = 0; i < length; i++)
                buf[i] = cg.next();
            return new java.lang.String(buf);
        }
    }

    public static class
            Short implements Generator<java.lang.Short> {
        private short value = 0;

        public java.lang.Short next() {
            return value++;
        }
    }

    public static class
            Integer implements Generator<java.lang.Integer> {
        private int value = 0;

        public java.lang.Integer next() {
            return value++;
        }
    }

    public static class
            Long implements Generator<java.lang.Long> {
        private long value = 0;

        public java.lang.Long next() {
            return value++;
        }
    }

    public static class
            Float implements Generator<java.lang.Float> {
        private float value = 0;

        public java.lang.Float next() {
            float result = value;
            value += 1.0;
            return result;
        }
    }

    public static class
            Double implements Generator<java.lang.Double> {
        private double value = 0.0;

        public java.lang.Double next() {
            double result = value;
            value += 1.0;
            return result;
        }
    }
}
