package core.basesyntax;
import java.util.Random;

public class Lottery {
    public String getRandomBall() {
       Random random = new Random();
       Ball ball = new Ball();
       ball.color = new ColorSupplier().getRandomColor().toString();
       ball.number = random.nextInt(100);
       return ball.toString();
    }
}
