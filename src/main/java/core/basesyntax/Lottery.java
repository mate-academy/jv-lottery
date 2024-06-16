package core.basesyntax;
import java.util.Random;
public class Lottery {
    ColorSupplier ball = new ColorSupplier();
    public String getRandomBall(){
        Random random = new Random();
        return (String.valueOf(random.nextInt(101))+ "   " + ball.getRandomColor());
    }
}