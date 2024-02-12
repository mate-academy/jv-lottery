package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(colorSupplier);
        int numberOfBalls = 3;
        for (int i = 0; i < numberOfBalls; i++) {
            Ball randomBall = lottery.getRandomBall();
            System.out.println("Random Ball #" + (i + 1) + ": " + randomBall);
        }
    }
}