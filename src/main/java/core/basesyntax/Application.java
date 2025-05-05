package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(new ColorSupplier());
        Ball[] bals = new Ball[3];

        for (int i = 0; i < 3; i++) {
            bals[i] = lottery.getRandomBall();
        }

        for (Ball ball : bals) {
            System.out.println(ball.toString());
        }
    }
}
