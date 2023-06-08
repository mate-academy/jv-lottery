package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ballOne = new Ball();
        Ball ballTwo = new Ball();
        Ball ballThree = new Ball();
        Ball[] ballWin = {ballOne, ballTwo, ballThree};
        for (ColorSupplier ball: ballWin) {
            System.out.println(ball);
        }
    }
}
