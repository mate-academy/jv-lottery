package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery funLottery = new Lottery();
        Ball[] balls = new Ball[3];

        for (int i = 0; i < balls.length; i++) {
            balls[i] = funLottery.getRandomBall();
        }

        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
