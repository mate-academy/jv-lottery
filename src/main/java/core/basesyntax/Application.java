package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Ball[] lottery = new Ball[3];

        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = Lottery.getRandomBall();
            System.out.println(lottery[i]);
        }
    }
}
