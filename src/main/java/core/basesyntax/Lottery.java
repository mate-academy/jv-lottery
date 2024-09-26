package core.basesyntax;
import java.util.Random;
public class Lottery {
    public static Ball getRandomBall(){
        Ball RandomBall = new Ball();
        RandomBall.setColor(ColorSupplier.getRandomColor());
        int RandomIndex = new Random().nextInt(101);
        RandomBall.setNumber(RandomIndex);
        return RandomBall;
    }
}
