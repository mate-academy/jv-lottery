package core.basesyntax;

import java.util.Random;

public class Lottery extends Application {
    public String getRandomBall() {

        Random random = new Random();

        int randomValue = random.nextInt(100);

        Ball ball = new Ball();

        ball.setNumber(randomValue);

        int randomBallNumber = ball.getNumber();

        String randomBallColor = ball.getRandomColor();

        return "The ball with " + randomBallColor + " color and " + randomBallNumber + " number";
    }

}
