package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery randomBall = new Lottery();
        Ball firstBall = randomBall.getRandomBall();
        Ball secondBall = randomBall.getRandomBall();
        Ball thirdBall = randomBall.getRandomBall();
        System.out.println(firstBall.toString());
        System.out.println(secondBall.toString());
        System.out.println(thirdBall.toString());
    }
}
