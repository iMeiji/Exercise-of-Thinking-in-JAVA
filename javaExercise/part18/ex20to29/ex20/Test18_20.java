package javaExercise.part18.ex20to29.ex20;

import net.mindview.util.BinaryFile;
import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/11/16.
 */
public class Test18_20 {
    final static byte[] signature =
            {(byte)202, (byte)254, (byte)186, (byte)190};
    public static void main(String[] args) throws IOException {
        for (File file : Directory.walk(".", ".*\\.class")) {
            print("file " + file);
            byte[] bt = BinaryFile.read(file);
            for (int i = 0; i < signature.length; i++)
                if (bt[i] != signature[i]) {
                    print(file + " is corrupt!");
                    break;
                }
        }
    }
}
