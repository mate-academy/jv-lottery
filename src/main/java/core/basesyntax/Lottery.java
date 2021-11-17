package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball luckyBall = new Ball();
        luckyBall.setColor(colorSupplier.getRandomColor());
        luckyBall.setNumber(random.nextInt(100));
        return luckyBall.toString();
    }
}
