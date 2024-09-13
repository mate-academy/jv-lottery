package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball chosenOne = new Ball();
        ColorSupplier randomColor = new ColorSupplier();
        int numbersLimit = 101;
        chosenOne.setColor(randomColor.getRandomColor());
        Random random = new Random();
        int randomNumber = random.nextInt(numbersLimit);
        chosenOne.setNumber(randomNumber);
        return chosenOne;
    }
}
