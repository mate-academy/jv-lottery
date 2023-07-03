package lottery;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_BALL = 100;
    private ColorSupplier colorSupplier;
    private Random randomHelper;

    public Lottery() {
        colorSupplier = new ColorSupplier();
        randomHelper = new Random();
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Random getRandomHelper() {
        return randomHelper;
    }

    public void setRandomHelper(Random randomHelper) {
        this.randomHelper = randomHelper;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomHelper.nextInt(MAX_NUMBER_BALL));
    }
}
