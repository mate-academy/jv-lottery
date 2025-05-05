package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery randomizer = new Lottery(new ColorSupplier());

        Ball [] balls = new Ball [] {
                randomizer.getRandomBall(),
                randomizer.getRandomBall(),
                randomizer.getRandomBall()
        };

        for (Ball ball: balls) {
            System.out.println(ball.toString());
        }
    }
}
