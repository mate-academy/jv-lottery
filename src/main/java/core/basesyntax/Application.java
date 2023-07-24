package core.basesyntax;

public class Application {
    private static final int BALL_NUMBER = 3;

    public static void main(String[] args) {
        Lottery[] lottery = new Lottery[BALL_NUMBER];
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = new Lottery();
            Ball randomBall = lottery[i].getRandomBall();
            System.out.println(randomBall);
        }
    }
}
