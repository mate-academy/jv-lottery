package core.basesyntax;

import java.lang.Math;

public class Lottery {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        Colors color = colorSupplier.getRandomColor();
        int number = (int) (Math.random() * 100) + 1;

        return new Ball(color, number);
    }
}
