package part13.ex19;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Utils.Print.print;

public class JGrep {

    static final String CLASS_NAME_REGEX = "[A-Za-z_][A-Za-z0-9_]*";

    static final String CLASS_NAME_REGEX_WITH_BRACKET = "(" + CLASS_NAME_REGEX + ")";

    static final String CLASS_REGEX = "class\\s+" + CLASS_NAME_REGEX_WITH_BRACKET + "|" + "extends\\s+"
            + CLASS_NAME_REGEX_WITH_BRACKET + "|" + "new\\s+" + CLASS_NAME_REGEX_WITH_BRACKET + "\\(";

    //这里写死了文件路径
    private static final String FILE_PATH =
            "C:\\Users\\yeming\\Documents\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part13\\ex17\\Person.java";


    public static void main(String[] args) throws Exception {
        //检测命令行参数格式是否合法
//        if (args.length != 1) {
//            System.out.println("Usage: java JGrep file regex");
//            System.exit(0);
//        }

        String textString = TextFile.read(FILE_PATH);

        //匹配注释
        Pattern p1 = Pattern.compile(CLASS_REGEX);
        Matcher m1 = p1.matcher(textString);
        while(m1.find()) {
            print(m1.group());
        }

    }
}