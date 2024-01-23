package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static final Random RANDOM = new Random();

    private final ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor().toString();
        int randomNumber = getRandomNumber();
        return new Ball(randomColor, randomNumber);
    }

    private int getRandomNumber() {
        return RANDOM.nextInt(MAX_NUMBER + 1); // включно з 0 до 100
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ball " + i + ": " + lottery.getRandomBall());
        }
    }
}
