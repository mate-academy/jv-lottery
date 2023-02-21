package core.basesyntax;
import java.util.Random;
public class Lottery {
    ColorSupplier colorSupplier;
    public int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public Ball getRandomBall(){
        colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.number = this.getRandomNumber();
        ball.color = colorSupplier.getRandomColor();
        return ball;
    }
}
