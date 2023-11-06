package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball1 = new Lottery().getRandomBall(new ColorSupplier().getRandomColor());
        Ball ball2 = new Lottery().getRandomBall(new ColorSupplier().getRandomColor());
        Ball ball3 = new Lottery().getRandomBall(new ColorSupplier().getRandomColor());
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
    }
}
