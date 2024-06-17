package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    static String getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        ball.setColour(getRandomColor());

        return String.valueOf(ball);
    }
}
