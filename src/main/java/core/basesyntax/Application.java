package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] balls = new Lottery[3];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery();
        }

        for (Lottery ball : balls) {
            System.out.println(ball.getRandomBall());
        }
    }
}
