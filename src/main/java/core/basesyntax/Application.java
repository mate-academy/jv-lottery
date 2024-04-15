package core.basesyntax;

import java.util.Random;

import static core.basesyntax.Lottery.getRandomBall;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Ball ball = getRandomBall(new ColorSupplier().getRandomColor(), ColorSupplier.random.nextInt(101));
            System.out.println(ball);
        }
    }
}
