package part9.ex11;

/**
 * Created by yeming on 2015/9/2.
 */
public class SwapperAdapter implements Processor<String>{
    @Override
    public String name() {
        return CharacterPairSwapper.class.getSimpleName();
    }

    @Override
    public String process(String input) {
        return CharacterPairSwapper.swap(input);
    }
}
