package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier color = new ColorSupplier();
        Ball[] balls = {Lottery.getRandomBall(random, color),
                Lottery.getRandomBall(random, color), Lottery.getRandomBall(random, color)};
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
