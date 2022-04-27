package core.basesyntax;

public class Main {
    private static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALLS_NUMBER; i++) {
            Ball randomBall = lottery.getRandomBall();
            System.out.println(randomBall);
        }
    }
}
