package javaExercise.part18.ex10to19.ex16;//: io/UsingRandomAccessFile.java

import java.io.IOException;
import java.io.RandomAccessFile;

import static net.mindview.util.Print.print;

public class UsingRandomAccessFile {
    static String file = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test16_in.txt";

    public static void main(String[] args)
            throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        rf.writeBoolean(true);
        rf.writeByte(1);
        rf.writeChar(2);
        rf.writeDouble(3.14159);
        rf.writeFloat(1222);
        rf.writeInt(11);
        rf.writeLong(22L);
        rf.writeShort(12);
        rf.writeUTF("The end of the file");
        rf.close();

        RandomAccessFile in = new RandomAccessFile(file, "r");
        print(in.readDouble());
        print(in.readByte());
        print(in.readChar());
        print(in.readDouble());
        print(in.readFloat());
        print(in.readInt());
        print(in.readLong());
        print(in.readShort());
        print(in.readUTF());

    }
}

