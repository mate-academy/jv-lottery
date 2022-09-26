package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lt = new Lottery();

        Ball firstBall = lt.getRandomBall();
        Ball secondBall = lt.getRandomBall();
        Ball thirdBall = lt.getRandomBall();

        System.out.println(firstBall);
        System.out.println(secondBall);
        System.out.println(thirdBall);
    }
}
