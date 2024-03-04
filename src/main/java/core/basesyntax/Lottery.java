package core.basesyntax;

import java.util.Random;

public class Lottery {

    Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        ball.setColor(color);

        Random random = new Random();
        int ballIndex = random.nextInt(101);
        ball.setNumber(ballIndex);
        return ball;
    }
}
