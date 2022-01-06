package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colors = new ColorSupplier();

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setColors(ColorSupplier colors) {
        this.colors = colors;
    }

    public ColorSupplier getColors() {
        return colors;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colors.getRandomColor().toString());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
