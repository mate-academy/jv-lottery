package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier.Colors randomColor = ColorSupplier.Colors.valueOf(getRandomColor());

        randomBall.setColor(randomColor.toString());

        randomBall.setNumber(new Random().nextInt(100) + 1);

        return randomBall;
    }
}
