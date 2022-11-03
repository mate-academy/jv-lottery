package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final int BALLS_QTY = 3;

        Ball[] balls = new Ball[BALLS_QTY];
        Lottery ballInstance = new Lottery();

        for(int i = 0; i < BALLS_QTY; i++) {
            balls[i] = ballInstance.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
