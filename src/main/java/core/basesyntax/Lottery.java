package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(String color, int range) {
        return new Ball(color, new Random().nextInt(range));
    }
}
