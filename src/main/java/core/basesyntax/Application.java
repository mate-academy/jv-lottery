package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lt1 = new Lottery();
        Lottery lt2 = new Lottery();
        Lottery lt3 = new Lottery();
        Lottery[] lotteries = new Lottery[] { lt1,lt2,lt3 };
        for (Lottery lottery : lotteries) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
