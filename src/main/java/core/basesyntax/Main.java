package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Ball firstBall = new Ball().getRandomBall();
        System.out.println(firstBall);
        Ball secondBall = new Ball().getRandomBall();
        System.out.println(secondBall);
        Ball thirdBall = new Ball().getRandomBall();
        System.out.println(thirdBall);
    }
}
