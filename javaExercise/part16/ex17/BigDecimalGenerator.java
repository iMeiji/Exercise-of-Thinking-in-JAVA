package javaExercise.part16.ex17;

import net.mindview.util.Generator;

import java.math.BigDecimal;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/22.
 */
public class BigDecimalGenerator implements Generator<BigDecimal> {

    @Override
    public BigDecimal next() {
        return new BigDecimal(1111);
    }

    public static void main(String[] args) {
        print(new BigDecimalGenerator().next());
    }
}
