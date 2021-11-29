package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int maxPossibleNumberOnBall = 100;

    public Lottery() {

    }

    public Lottery(int maxPossibleNumberOnBall) {
        this.maxPossibleNumberOnBall = maxPossibleNumberOnBall;
    }

    public Ball getRandomBall() {
        Random random = new Random();
        return new Ball(
                new ColorSupplier().getRandomColor(),
                random.nextInt(maxPossibleNumberOnBall) + 1
        );
    }
}
