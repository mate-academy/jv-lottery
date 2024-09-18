package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < 3; i++) {
            Ball randomBall = new Lottery().getRandomBall();
            System.out.println("Ball №" + (i + 1) + ": " + randomBall);
        }
    }
}
