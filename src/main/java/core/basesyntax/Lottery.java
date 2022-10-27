package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public String getRandomBall() {
        Ball ball = new Ball(getRandomColor());
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        return ball.toString();
    }

}
