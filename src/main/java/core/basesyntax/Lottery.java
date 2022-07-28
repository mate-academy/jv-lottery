package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(),new Random().nextInt(100)).toString();
    }
}
