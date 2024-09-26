package core.basesyntax;
import java.util.Random;
public class Lottery {
    public static Ball getRandomBall(){
        Ball randomBall = new Ball();
        randomBall.setColor(ColorSupplier.getRandomColor());
        int RandomIndex = new Random().nextInt(101);
        randomBall.setNumber(RandomIndex);
        return randomBall;
    }
}
