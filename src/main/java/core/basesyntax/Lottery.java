package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public String getRandomBall() {
        int randomNumber = new Random().nextInt(100);

        Ball ball = new Ball(getRandomColor(), randomNumber);

        return ball.toString();
    }

}
