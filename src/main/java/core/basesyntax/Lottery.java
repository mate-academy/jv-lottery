package core.basesyntax;
import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_BALL_NUMBER = 100;
    public Ball getRandomBall() {
        int randomNum = random.nextInt(MAX_BALL_NUMBER + 1);
        Color randomColor = colorSupplier.getRandomColor();
        Ball result = new Ball();
        result.setColor(randomColor);
        result.setNumber(randomNum);
        return result;
    }
}
