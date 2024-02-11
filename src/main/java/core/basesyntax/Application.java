package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        ColorSupplier colorSupplier = new ColorSupplier();
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            ball.setColor(colorSupplier.getRandomColor());
            System.out.println(ball);
        }
    }
}
