package core.basesyntax;
import java.util.Random;
public class Lottery {
    public Ball getRandomBall() {
        Ball bl = new Ball();
        bl.number = (new Random()).nextInt(100);
        bl.color = (new ColorSupplier()).getRandomColor();
        return bl;
    }
}
