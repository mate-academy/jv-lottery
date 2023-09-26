package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball firstLottery = Lottery.getRandomBall();
        Ball secLottery = Lottery.getRandomBall();
        Ball thrtLottery = Lottery.getRandomBall();
        System.out.println(firstLottery);
        System.out.println(secLottery);
        System.out.println(thrtLottery);
    }
}
