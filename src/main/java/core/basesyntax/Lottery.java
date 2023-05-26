package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomBall() {
        Ball luckyBall = new Ball();
        luckyBall.setColor(colorSupplier.getRandomColor());
        luckyBall.setNumber(random.nextInt(100));
        return luckyBall.toString();
    }
}
