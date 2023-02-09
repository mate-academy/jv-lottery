package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ball1 = new Ball(Lottery.getRandomBall(), ColorSupplier.getRandomColor());
        Ball ball2 = new Ball(Lottery.getRandomBall(), ColorSupplier.getRandomColor());
        Ball ball3 = new Ball(Lottery.getRandomBall(), ColorSupplier.getRandomColor());
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
    }
}
