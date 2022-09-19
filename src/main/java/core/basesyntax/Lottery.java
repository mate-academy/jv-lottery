package core.basesyntax;

import java.util.Random;

public class Lottery {
        public static void getRandomBall() {
            Random random = new Random();
            int value = new Random().nextInt(100);
            System.out.println(ColorSupplier.getRandomColor() + " " + value);
        }
}
