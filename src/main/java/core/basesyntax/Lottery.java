package core.basesyntax;

import java.util.Random;

<<<<<<< HEAD
public class Lottkb, ,ery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
=======
public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball(getRandomColor(), random.nextInt(100));
        return ball;
>>>>>>> 9fef066f728358ef0094873162a8c90fef74d271
    }
}
