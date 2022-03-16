package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery one = new Lottery();
        Lottery two = new Lottery();
        Lottery three = new Lottery();

        Lottery [] arrayLotteryBall = {one, two, three};

        for (Lottery ball : arrayLotteryBall) {
            System.out.println(ball.getRandomBall());
        }
    }
}
