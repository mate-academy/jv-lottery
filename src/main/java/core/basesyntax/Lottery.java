package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colours = new ColorSupplier();

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setColours(ColorSupplier colours) {
        this.colours = colours;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colours.getRandomColor().toString());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
