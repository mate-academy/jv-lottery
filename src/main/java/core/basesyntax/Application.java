package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        int ballsQuantity = 3;
        Ball[] balls = new Ball[ballsQuantity];
        for (int i = 0; i < ballsQuantity; i++) {
            balls[i] = new Lottery().getRandomBall();
        }
        for (Ball bal: balls) {
            System.out.println(bal.toString());
        }
    }
}
