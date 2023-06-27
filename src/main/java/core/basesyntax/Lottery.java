package core.basesyntax;

import java.util.Random;
public class Lottery {
        private static final int MAX_NUMBER_OF_BALL = 100;
        ColorSupplier colorSupplier = new ColorSupplier();
        Random number = new Random();

        public Ball getRandomBall() {
            return new Ball(colorSupplier.getRandomColor(), number.nextInt(MAX_NUMBER_OF_BALL));
        }
}
