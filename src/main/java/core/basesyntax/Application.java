package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Ball[] balls = new Ball[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = Lottery.getRandomBall();
            balls[i].toString();
        }
        // create three balls using class Lottery and print information about them in console
    }
}
