package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        return new Ball(new ColorSupplier().getRandomColor(), random.nextInt(100)).toString();
    }
}
