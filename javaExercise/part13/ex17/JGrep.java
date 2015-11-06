package part13.ex17;

import java.util.regex.*;

import net.mindview.util.*;

import static Utils.Print.*;

public class JGrep {

    static final String CMNT_EXT_REGEX =
            "(?x)(?m)(?s) # Comments, Multiline & Dotall: ON\n" +
                    "/\\* # Match START OF THE COMMENT\n" +
                    "(.*?) # Match all chars\n" +
                    "\\*/ # Match END OF THE COMMENT\n" +
                    "| //(.*?)$ # OR Match C++ style comments\n";

    //����д�����ļ�·��
    private static final String FILE_PATH =
            "C:\\Users\\yeming\\Documents\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part13\\part17\\Person.java";


    public static void main(String[] args) throws Exception {
        //��������в�����ʽ�Ƿ�Ϸ�
//        if (args.length != 1) {
//            System.out.println("Usage: java JGrep file regex");
//            System.exit(0);
//        }

        String textString = TextFile.read(FILE_PATH);

        //ƥ��ע��
        Pattern p1 = Pattern.compile(CMNT_EXT_REGEX);
        Matcher m1 = p1.matcher(textString);
        while(m1.find()) {
            print(m1.group());
        }

    }
}