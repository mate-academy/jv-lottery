package core.basesyntax;

import java.util.Arrays;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Color[] colors = Color.values();
        Random randomColor = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(randomColor, colors);
        Random randomNumber = new Random();
        Lottery lottery = new Lottery(colorSupplier, randomNumber);

        Ball[] balls = new Ball[3];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }

        System.out.println(Arrays.toString(balls));
    }
}
