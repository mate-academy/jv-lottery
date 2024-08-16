package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        int ballNum = new Random().nextInt(0,100);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        Ball ball = new Ball(ballNum, randomColor);
        return ball.toString();
    }
}
