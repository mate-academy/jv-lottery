package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier.Lottery lottery = new ColorSupplier.Lottery();

        ColorSupplier.Ball ball1 = lottery.getRandomBall();
        ColorSupplier.Ball ball2 = lottery.getRandomBall();
        ColorSupplier.Ball ball3 = lottery.getRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
