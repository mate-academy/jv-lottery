package core.basesyntax;
import java.util.Random;
public class Lottery {
    public Ball getRandomBall() {
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(0, 101);
        ColorSupplier randomColor = new ColorSupplier();
        Colors colour = randomColor.getColor();
        String color = colour.toString();
        Ball randomBall = new Ball();
        randomBall.number = number;
        randomBall.color = color;
        return randomBall;
    }
}