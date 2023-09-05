package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] lackyBall = new Ball[3];
        for (int i = 0; i < 3; i++) {
            lackyBall[i] = Lottery.getRandomball();
            System.out.println(" The lacky ball N" + (i + 1) + " is " + lackyBall[i]);
        }
    }
}
