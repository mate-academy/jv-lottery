package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier(random);
    private static final Lottery LOTTERY = new Lottery(random, colorSupplier);

    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            balls.add(LOTTERY.getRandomBall());
        }

        balls.forEach(System.out::println);
    }
}
