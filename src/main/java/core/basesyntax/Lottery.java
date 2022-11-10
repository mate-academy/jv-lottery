package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Random getRandom() {
        return random;
    }

    private final Random random = new Random();

    public String getRandomBall() {

        int maxPossibleNumber = 100;

        int randomValue = random.nextInt(maxPossibleNumber);

        Ball ball = new Ball();

        ball.setNumber(randomValue);

        ColorSupplier randomColor = new ColorSupplier();

        String rndClr = randomColor.getRandomColor();

        ball.setColor(rndClr);

        return ball.toString();
    }

}
