package javaExercise.part17.ex30to39.ex31;

/**
 * Created by yeming on 2015/11/10.
 */
public class StringContainer {

    //初始化数组大小
    private static int INIT_SIZE;

    //数据目前的大小
    private int realSize;

    //当前元素实际个数
    private int realCount = 0;

    //包装的数组
    private String[] strings;

    public StringContainer(int initSize) {
        INIT_SIZE = initSize;
        realSize = INIT_SIZE;
        strings = new String[realSize];
    }

    //添加字符串
    public void add(String string) {
        if (realCount > realSize) {
            String[] tmps = new String[realSize + INIT_SIZE];
            for (int i = 0; i < realSize; i++) {
                tmps[i] = strings[i];
            }
            strings = tmps;
        }
        strings[realCount] = string;
        realCount++;
    }

    //获取字符串
    public String get(int index) {
        if (index >= 0 && index < realCount) {
            return strings[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void clear() {
        strings = new String[realSize];
        realCount = INIT_SIZE;
        realCount = 0;
    }

    public int size() {
        return realCount;
    }


    @Override
    public String toString() {
        String str = "";
        for(String s: strings) {
            if(s == null) {
                break;
            }
            str += s + " ";
        }
        return str;
    }

}
