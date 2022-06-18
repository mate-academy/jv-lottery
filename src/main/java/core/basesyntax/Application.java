package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lotteryBall_1 = new Lottery();
        System.out.println(lotteryBall_1.getRandomBall());
        Lottery lotteryBall_2 = new Lottery();
        System.out.println(lotteryBall_2.getRandomBall());
        Lottery lotteryBall_3 = new Lottery();
        System.out.println(lotteryBall_3.getRandomBall());
    }
}
