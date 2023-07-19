package core.basesyntax;

public class Main {
    private static final int ballNumber = 3;

    public static void main(String[] args) {
        Lottery[] lottery = new Lottery[ballNumber];
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = new Lottery();
            Ball randomBall = lottery[i].getRandomBall();
            System.out.println(randomBall);
        }
    }
}
