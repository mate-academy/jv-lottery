package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();

        int index = new Random().nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        ball.setColor(String.valueOf(color));

        int number = random.nextInt(100);
        ball.setNumber(number);

        return ball;
    }
}
