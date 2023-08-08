package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = generateBalls(3);
        printBallsInfo(balls);
        // create three balls using class Lottery and print information about them in console
    }

    private static Ball[] generateBalls(int size) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[size];
        for (int i = 0; i < size; i++) {
            balls[i] = lottery.getRandomBall();
        }
        return balls;
    }

    private static void printBallsInfo(Ball[] balls) {
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
