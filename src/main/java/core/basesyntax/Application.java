package core.basesyntax;

public class Application {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball [] balls = new Ball[SIZE];
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
