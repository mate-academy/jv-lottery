package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();

        //Create balls
        Ball[] randomBalls = new Ball[3];
        for (int i = 0; i < randomBalls.length; i++) {
            randomBalls[i] = lottery.getRandomBall();
        }

        //Print all balls
        for (Ball ball: randomBalls) {
            System.out.println(ball.getColor());
            System.out.println(ball.getNumber());
        }
    }
}
