package core.basesyntax.model;

import core.basesyntax.ColorSupplier;
import core.basesyntax.enums.Color;
import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        return new Ball(new Random().nextInt(101),
                        Color.valueOf(new ColorSupplier().getRandomColor()));
    }
}
