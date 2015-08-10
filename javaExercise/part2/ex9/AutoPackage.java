import java.lang.*;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Double;
import java.lang.Float;
import java.lang.Long;
import java.lang.Short;
import java.lang.System;

public class AutoPackage {
    boolean b;
    Boolean bb;
    char c;
    Character cc;
    byte by;
    Byte bbyy;
    short s;
    Short ss;
    int i;
    java.lang.Integer ii;
    long l;
    Long ll;
    float f;
    Float ff;
    double d;
    Double dd;

    public static void main(String[] args) {
        AutoPackage autoPackage = new AutoPackage();
        System.out.println("b " + autoPackage.b);
        //省略其他成员
    }
}