package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console

        Lottery[] lotteries = new Lottery[3];
        Ball[] balls = new Ball[lotteries.length];

        for (int i = 0; i < lotteries.length; i++) {
            lotteries[i] = new Lottery();
            balls[i] = lotteries[i].getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
