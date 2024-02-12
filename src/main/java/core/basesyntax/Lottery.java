package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random randomNumberService = new Random();
    private final ColorSupplier colorSupplierService = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplierService.getRandomColor(), randomNumberService.nextInt(101));
    }
}
