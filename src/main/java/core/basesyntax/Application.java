package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] ballArray = new Ball[3];

        for (Ball currentBall : ballArray) {
            currentBall = lottery.getRandomBall();
            System.out.println(currentBall);
        }
    }
}
