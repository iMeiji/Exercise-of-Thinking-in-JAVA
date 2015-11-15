package javaExercise.part18.ex10to19.ex15;//: io/StoringAndRecoveringData.java

import java.io.*;

import static net.mindview.util.Print.*;

public class StoringAndRecoveringData {
    static String file = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test15_in.txt";

    public static void main(String[] args) throws IOException {

        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(file)));
        out.writeBoolean(true);
        out.writeByte(1);
        out.writeChar(2);
        out.writeDouble(3.14159);
        out.writeFloat(1222);
        out.writeInt(11);
        out.writeLong(22L);
        out.writeShort(12);
        out.writeUTF("That was pi");
        out.close();

        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)));
        print(in.readDouble());
        print(in.readByte());
        print(in.readChar());
        print(in.readDouble());
        print(in.readFloat());
        print(in.readInt());
        print(in.readLong());
        print(in.readShort());
        print(in.readUTF());
        in.close();
    }
}
