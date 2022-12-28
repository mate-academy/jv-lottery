package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball firstBall = new Lottery().getRandomBall();
        Ball secondBall = new Lottery().getRandomBall();
        Ball thirdBall = new Lottery().getRandomBall();

        System.out.println(firstBall);
        System.out.println(secondBall);
        System.out.println(thirdBall);
    }
}
