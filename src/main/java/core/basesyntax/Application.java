package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery newLottery = new Lottery();

        Ball firstBall = newLottery.getRandomBall();
        Ball secondBall = newLottery.getRandomBall();
        Ball thirdBall = newLottery.getRandomBall();

        System.out.println(firstBall);
        System.out.println(secondBall);
        System.out.println(thirdBall);
    }
}

