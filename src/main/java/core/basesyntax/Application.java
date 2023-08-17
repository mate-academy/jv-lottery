package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ball1 = new Ball();
        ball1.setBall(NumberSupplier.getRandomNumber(), ColorSupplier.getRandomColor());
        System.out.println(ball1);

        Ball ball2 = new Ball();
        ball2.setBall(NumberSupplier.getRandomNumber(), ColorSupplier.getRandomColor());
        System.out.println(ball2);

        Ball ball3 = new Ball();
        ball3.setBall(NumberSupplier.getRandomNumber(), ColorSupplier.getRandomColor());
        System.out.println(ball3);
    }
}
