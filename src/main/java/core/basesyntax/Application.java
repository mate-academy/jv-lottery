package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[]{Lottery.getRandomBall(), Lottery.getRandomBall(), Lottery.getRandomBall()};
        Lottery[] ball1;
        for (Ball value : balls) {
            System.out.println(value);
        }
    }
}
