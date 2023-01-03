package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        Ball firstBall = getRandomBall();
        Ball secondBall = getRandomBall();
        System.out.println(firstBall);
        System.out.println(secondBall);
    }
}
