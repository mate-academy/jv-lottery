package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery1 = new Lottery();
        Lottery lottery2 = new Lottery();
        Lottery lottery3 = new Lottery();
        Lottery [] lotteries = {lottery1,lottery2,lottery3};
        for (Lottery lottery:lotteries) {
            System.out.println(lottery.getRandomBall());
        }

    }
}
