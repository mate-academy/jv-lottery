package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Ball luckyBall = new Ball();
        luckyBall.setColor(new ColorSupplier().getRandomColor());
        luckyBall.setNumber(new Random().nextInt(100));
        return luckyBall.toString();
    }
}
