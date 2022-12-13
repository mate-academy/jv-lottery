package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random randomNumber = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumberBall = randomNumber.nextInt(100);
        Ball ball = new Ball();
        ball.number = String.valueOf(randomNumberBall);
        ball.color = colorSupplier.getRandomColor();
        return ball;
    }

}
