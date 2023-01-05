package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[3];
        Lottery lottery = new Lottery();
        for (Ball ball : balls) {
            ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
