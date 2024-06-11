package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER + 1);
        return new Ball(randomColor, randomNumber);
    }

    public List<Ball> generateBalls(int numberOfBalls) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < numberOfBalls; i++) {
            balls.add(getRandomBall());
        }
        return balls;
    }
}
