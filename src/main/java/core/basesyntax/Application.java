package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] lotteries = new Lottery[3];

        for (int i = 0; i < 3; i++) {
            lotteries[i] = new Lottery();
            Ball randomBall = lotteries[i].getRandomBall();
            System.out.println(randomBall);
        }
    }
}

