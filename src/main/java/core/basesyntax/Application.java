package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] lotteries = new Lottery[3];
        for (int i = 0; i < lotteries.length; i++) {
            lotteries[i] = new Lottery();
            System.out.println("color "+lotteries[i].getRandomBall().getColor()+" number "+lotteries[i].getRandomBall().getNumber());
        }
    }
}
