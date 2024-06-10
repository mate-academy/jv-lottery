package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private final Ball ball1;
    private final Ball ball2;
    private final Ball ball3;

    public Lottery() {
        this.ball1 = getRandomBall();
        this.ball2 = getRandomBall();
        this.ball3 = getRandomBall();
    }

    public Ball getBall1() {
        return ball1;
    }

    public Ball getBall2() {
        return ball2;
    }

    public Ball getBall3() {
        return ball3;
    }

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(101);
        return new Ball(randomColor, randomNumber);
    }
}
