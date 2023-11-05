package core.basesyntax.model;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        return new Ball(new Random().nextInt(101));
    }
}
