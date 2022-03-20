package core.basesyntax;

public class Application {
    private static final int Ball = 3;

    public static void main(String[] args) {
        Lottery[] lotteries = new Lottery[Ball];
        for (int i = 0; i < lotteries.length; i++) {
            lotteries[i] = new Lottery();
            System.out.println(lotteries[i].getRandomBall() + " " + lotteries[i].getRandomColor());
        }
    }
}
