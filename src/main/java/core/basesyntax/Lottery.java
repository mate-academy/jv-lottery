package core.basesyntax;
import java.util.Random;
public class Lottery {
    static ColorSupplier colorSupplier = new ColorSupplier();
    public static Ball getRandomBall(){
        Ball randomBall = new Ball();
        randomBall.setColor(colorSupplier.getRandomColor());
        int randomIndex = new Random().nextInt(101);
        randomBall.setNumber(randomIndex);
        return randomBall;
    }
}
