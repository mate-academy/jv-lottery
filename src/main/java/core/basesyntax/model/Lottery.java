package core.basesyntax.model;

import core.basesyntax.ColorSupplier;
import core.basesyntax.enums.Color;
import java.util.Random;

public class Lottery {

    public static final int MAX_NUMBER = 101;

    public Ball getRandomBall() {
        return new Ball(new Random().nextInt(MAX_NUMBER),
                        Color.valueOf(new ColorSupplier().getRandomColor()));
    }
}
