package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        String randomBallColor = getRandomColor();
        Random randomNumber = new Random();
        int randomBallNumber = randomNumber.nextInt(100);
        Ball randomBall = new Ball();
        randomBall.setNumber(randomBallNumber);
        randomBall.setColor(randomBallColor);
        return randomBall;
    }
}
