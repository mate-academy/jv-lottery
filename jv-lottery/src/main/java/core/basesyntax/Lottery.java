package core.basesyntax;
import java.util.Random;
public class Lottery {
private static final int max_ball_number = 100;
private final ColorSupplier colorSupplier = new ColorSupplier();
private final Random random = new Random();
public Ball getRandomBall() {
    Color color = colorSupplier.getRandomColor();
    int number = getRandomNumber();
    return new Ball(color, number);
}
private int getRandomNumber() {
    return random.nextInt(max_ball_number) + 1;
}
}
