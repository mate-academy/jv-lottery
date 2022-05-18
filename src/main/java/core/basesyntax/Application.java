package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(i + " ball: " + balls[i]);
        }
        // create three balls using class Lottery and print information about them in console
    }
}
