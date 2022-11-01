package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball firstBall = new Ball();
        Ball secondBall = new Ball();
        Ball thirdBall = new Ball();

        System.out.println("The first ball is " + firstBall.toString());
        System.out.println("The second ball is " + secondBall.toString());
        System.out.println("The third ball is " + thirdBall.toString());
    }
}
