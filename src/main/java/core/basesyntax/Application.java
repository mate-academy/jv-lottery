package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        int numberOfBallsToDraw = 3;
        for (int i = 0; i < numberOfBallsToDraw; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}

