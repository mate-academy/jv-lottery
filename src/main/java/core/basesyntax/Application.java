package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lotteryObject = new Lottery();
        Ball ball1 = lotteryObject.getRandomBall();
        Ball ball2 = lotteryObject.getRandomBall();
        Ball ball3 = lotteryObject.getRandomBall();
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
