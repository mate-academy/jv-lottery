package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Lottery lot = new Lottery();
            Ball ball = lot.getRandomBall();
            System.out.println("Ball colour: " + ball.getColor() + ", number: " + ball.getNumber());
        }

        // create three balls using class Lottery and print information about them in console
    }
}
