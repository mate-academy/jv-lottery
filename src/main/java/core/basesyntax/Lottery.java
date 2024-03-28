package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Color color = colorSupplier.getRandomColor();
    private int number = new Random().nextInt(100);

    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.setColor(color);
        newBall.setNumber(number);
        return newBall;
    }
}
