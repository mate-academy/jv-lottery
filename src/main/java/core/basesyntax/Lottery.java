package core.basesyntax;
import java.util.Random;
public class Lottery {
    private int number = 101;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), random.nextInt(number));
    }
}
