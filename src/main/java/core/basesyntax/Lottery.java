package core.basesyntax;
import java.util.Random;
public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Random random = new Random();
        int indexNumber = random.nextInt(100);
        ColorsEnum color = getRandomColor();
        return new Ball(color, indexNumber);
    }
}
