package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    // if I assing it as MAX_VALUE then there is a mistake when calling mvn clean package
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
