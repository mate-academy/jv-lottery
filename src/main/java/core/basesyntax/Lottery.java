package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;
    private List<Ball> balls = new ArrayList<>();

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        balls.add(ball);

        return ball;
    }

    public List<Ball> getBalls() {
        return balls;
    }
}
