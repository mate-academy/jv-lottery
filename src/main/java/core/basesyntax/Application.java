package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Ball ball = new Ball().getRandomBall();
            System.out.println("Ball " + (i + 1) + ":" + ball.getColor() + " " + ball.getNumber());
        }

        // create three balls using class Lottery and print information about them in console
    }
}
