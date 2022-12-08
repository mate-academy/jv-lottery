package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball firstLottery = new Ball();
        Ball secondLottery = new Ball();
        Ball thirdLottery = new Ball();
        Ball[] balls = new Ball[] {firstLottery, secondLottery, thirdLottery};
        for (int i = 0; i < balls.length; i++) {
            System.out.println(balls[i]);
        }
    }
}
