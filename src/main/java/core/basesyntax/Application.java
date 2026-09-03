package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[3];

        for (int a = 0; a < balls.length; a++) {
            balls[a] = new Lottery().getRandomBall();
            System.out.println(balls[a]);
        }
    }
}
