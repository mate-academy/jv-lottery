package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        ColorSupplier dad = new ColorSupplier();
        ColorDiff randomColor = dad.getRandomColor();
        Ball bl = new Ball();
        bl.setColor(randomColor);
        bl.setNumber(randomNumber);
        return bl;
    }
}




