package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] randomBall = new Ball[3];
        for (int i = 0; i < 3; i++) {
            randomBall[i] = lottery.getRandomBall();
            System.out.println(randomBall[i]);
        }
    }
}
