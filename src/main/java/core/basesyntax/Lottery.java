package core.basesyntax;
import java.util.Random;
import static core.basesyntax.ColorSupplier.getRandomColor;

public class Lottery {
    private static Random random = new Random();
    public Ball getRandomBall(){
        String color = getRandomColor();
        int number = random.nextInt(100) + 1;
        return new Ball(color, number);
    }
}
