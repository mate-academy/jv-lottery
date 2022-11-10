package core.basesyntax;

import java.util.Random;

public class Lottery {

    public String getRandomBall() {

        Random random = new Random();

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
