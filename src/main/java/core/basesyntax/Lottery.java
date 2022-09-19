package core.basesyntax;
import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        ball.color = String.valueOf(supplier.getRandomColor());
        Random number = new Random();
        ball.number = number.nextInt(100);
        return "Color is: " + ball.color + "\n" + "Number is: " + ball.number;
    }

}
