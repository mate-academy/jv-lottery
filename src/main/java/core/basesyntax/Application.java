package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lotteryBall01 = new Lottery();
        System.out.println(lotteryBall01.getRandomBall());
        Lottery lotteryBall02 = new Lottery();
        System.out.println(lotteryBall02.getRandomBall());
        Lottery lotteryBall03 = new Lottery();
        System.out.println(lotteryBall03.getRandomBall());
    }
}
