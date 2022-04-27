package core.basesyntax;

public class Main {
    private static final int MAX_I = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < MAX_I; i++) {
            Ball randomBall = lottery.getRandomBall();
            System.out.println(randomBall);
        }
    }
}
