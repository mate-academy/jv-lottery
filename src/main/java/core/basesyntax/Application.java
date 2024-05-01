package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] ball = new Ball[3];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = new Ball();
        }
        for (Ball balls : ball) {
            Lottery.getRandomBall(balls);
            System.out.println(balls);
            // create three balls using class Lottery and print information about them in console
        }
    }
}
