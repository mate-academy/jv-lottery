package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        // create random color
        ColorSupplier newCollor = new ColorSupplier();
        String randomColor = newCollor.getRandomColor();

        // create random number
        Random randomOfNumbers = new Random();
        int randomNumber = randomOfNumbers.nextInt(100);

        //crate new random ball
        Ball newBall = new Ball();
        newBall.setColor(randomColor);
        newBall.setNumber(randomNumber);

        return newBall;
    }
}
