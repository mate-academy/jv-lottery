package core.basesyntax;

import java.util.Random;

public class Application {
    private final Ball ball1;
    private final Ball ball2;
    private final Ball ball3;

    public Application() {
        ColorSupplier colorSupplier = new ColorSupplier();
        ball1 = new Ball(colorSupplier.getRandomColor(), new Random().nextInt(101));
        ball2 = new Ball(colorSupplier.getRandomColor(), new Random().nextInt(101));
        ball3 = new Ball(colorSupplier.getRandomColor(), new Random().nextInt(101));
    }

    public static void main(String[] args) {
        Application app = new Application();

        System.out.println(app.ball1);
        System.out.println(app.ball2);
        System.out.println(app.ball3);

        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
