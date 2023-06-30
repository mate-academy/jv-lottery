package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_RANDOM_VALUE = 100;
    private ColorSupplier randomColor;
    private Ball randomlyBall;

    public ColorSupplier getRandomColor() {
        return randomColor;
    }

    public void setRandomColor(ColorSupplier randomColor) {
        this.randomColor = randomColor;
    }

    public Ball getRandomlyBall() {
        return randomlyBall;
    }

    public void setRandomlyBall(Ball randomlyBall) {
        this.randomlyBall = randomlyBall;
    }

    public Ball getRandomBall() {
        setRandomColor(new ColorSupplier());
        setRandomlyBall(new Ball());
        getRandomlyBall().setColor(getRandomColor().getRandomColor());
        getRandomlyBall().setNumber(new Random().nextInt(MAX_BALL_RANDOM_VALUE));
        return randomlyBall;
    }
}
