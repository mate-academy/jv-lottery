package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Colors[] colors = Colors.values();
        ColorSupplier colorSupplier = new ColorSupplier(colors);
        Lottery lottery = new Lottery(colorSupplier);
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
