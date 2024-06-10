package core.basesyntax;

import java.util.Random;

public class Application {
    private final Ball BALL1;
    private final Ball BALL2;
    private final Ball BALL3;

    public Application() {
        ColorSupplier colorSupplier = new ColorSupplier();
        BALL1 = new Ball(colorSupplier.getRandomColor(), new Random().nextInt(101));
        BALL2 = new Ball(colorSupplier.getRandomColor(), new Random().nextInt(101));
        BALL3 = new Ball(colorSupplier.getRandomColor(), new Random().nextInt(101));
    }

    public static void main(String[] args) {
        Application app = new Application();

        System.out.println(app.BALL1);
        System.out.println(app.BALL2);
        System.out.println(app.BALL3);

        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}