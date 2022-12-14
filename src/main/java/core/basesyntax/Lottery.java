package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random randomNumber = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumberBall = randomNumber.nextInt(100);//range 0...100
        Ball ball = new Ball();
        ball.setNumber(String.valueOf(randomNumberBall));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }

}
