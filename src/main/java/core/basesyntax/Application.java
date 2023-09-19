package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(colorSupplier);

        for (int j = 0; j < 3; j++) {
            Ball ball = lottery.getRandomBall();
            System.out.println("Random Ball :" + ball);
        }
    }
}
