package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        String randomColor = color.getRandomColor();
        Random number = new Random();
        int randomNumber = number.nextInt(100);
        Ball randomBall = new Ball(randomColor, randomNumber);
        return randomBall;
    }
}
