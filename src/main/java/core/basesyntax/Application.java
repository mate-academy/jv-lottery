package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] ball = new Ball[1000];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = new Ball();
        }
        for (Ball balls : ball) {
            Lottery.getRandomBall(balls);
            System.out.println(balls);
        }
    }
}
