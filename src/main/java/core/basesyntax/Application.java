package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int numberOfBalls = 3;

        for (int i = 0; i < numberOfBalls; i++) {
            String randomColor = ColorSupplier.getRandomColor();
            int randomNumber = new Random().nextInt(100);
            System.out.println(new Ball(randomColor, randomNumber));
        }
    }
}
