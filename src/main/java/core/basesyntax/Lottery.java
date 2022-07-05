package core.basesyntax;
import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int value = new Random().nextInt(100);
        int index = new Random().nextInt(Color.values().length);
        return new Ball(value, index);
    }
}
