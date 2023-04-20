package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int maxNum = 100;
    private Ball ball;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandom() {
        return new Ball(random.nextInt(maxNum), colorSupplier.getRandomColor());
    }

}
