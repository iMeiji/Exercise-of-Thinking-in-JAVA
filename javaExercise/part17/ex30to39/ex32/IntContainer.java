package javaExercise.part17.ex30to39.ex32;

/**
 * Created by yeming on 2015/11/10.
 */
public class IntContainer {

    //初始化数组大小
    private static int INIT_SIZE;

    //数据目前的大小
    private int realSize;

    //当前元素实际个数
    private int realCount = 0;

    //包装的数组
    private int[] numbers;

    public IntContainer(int initSize) {
        INIT_SIZE = initSize;
        realSize = INIT_SIZE;
        numbers = new int[realSize];
    }

    //添加字符串
    public void add(int number) {
        if (realCount > realSize) {
            int[] tmps = new int[realSize + INIT_SIZE];
            for (int i = 0; i < realSize; i++) {
                tmps[i] = numbers[i];
            }
            numbers = tmps;
        }
        numbers[realCount] = number;
        realCount++;
    }

    //获取字符串
    public int get(int index) {
        if (index >= 0 && index < realCount) {
            return numbers[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void set(int index, int number) {
        if (index >= 0 && index < realCount) {
            numbers[index] = number;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void clear() {
        numbers = new int[realSize];
        realCount = INIT_SIZE;
        realCount = 0;
    }

    public int size() {
        return realCount;
    }


    @Override
    public String toString() {
        String str = "";
        for(int i=0;i<realCount;i++) {
            str += numbers[i] + " ";
        }
        return str;
    }

}
