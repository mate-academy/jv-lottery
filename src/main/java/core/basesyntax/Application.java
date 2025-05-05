package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[3];
        Lottery lotto = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lotto.getRandomBall();
            System.out.println(balls[i]);
        }

    }
}
