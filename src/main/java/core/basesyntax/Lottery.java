package core.basesyntax;
import java.util.Random;

public class Lottery {
    public String getRandomBall(){
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();

        int value = random.nextInt(100);
        String color = colorSupplier.getRandomColor();

        ball.setColor(color);
        ball.setNumber(value);

        return String.valueOf(ball);
    }
}
