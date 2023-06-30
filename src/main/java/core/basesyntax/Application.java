package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = new Lottery().getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
