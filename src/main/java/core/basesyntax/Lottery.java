package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier{
    public static Ball getRandomBall() {
      String randomColor =  ColorSupplier.getRandomColor().toString().toLowerCase();
        int randomNumber = intRandom(); // Random number between 1 and 100
        return new Ball(randomColor, randomNumber);
    }
}
