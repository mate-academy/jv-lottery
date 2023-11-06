package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(Color color) {
        int number = new Random().nextInt(101);
        return new Ball(color, number);
    }
}
