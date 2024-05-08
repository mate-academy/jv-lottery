package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MUX_NUMBER = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandobBall() {
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(MUX_NUMBER) + 1;
        return new Ball(number, color);
    }
}
