package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[3];

        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Ball();
            balls[i].setColor(colorSupplier.getRandomColor());
            lottery.getRandomBall(balls[i]);
            System.out.println(balls[i]);
        }
    }
}
