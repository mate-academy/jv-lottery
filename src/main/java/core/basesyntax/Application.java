package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ballSupplier = new Lottery();
        Ball[] arrayOfThreeBalls = new Ball[3];
        for (int i = 0; i < arrayOfThreeBalls.length; i++) {
            arrayOfThreeBalls[i] = ballSupplier.getRandomBall();
        }
        for (Ball ball : arrayOfThreeBalls) {
            System.out.println(ball);
        }
        // create three balls using class Lottery and print information about them in console
    }
}
