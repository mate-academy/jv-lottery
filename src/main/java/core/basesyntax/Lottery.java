package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Ball chosenOne = new Ball();
        chosenOne.setColor(getRandomColor());
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        chosenOne.setNumber(randomNumber);
        return chosenOne;
    }
}
