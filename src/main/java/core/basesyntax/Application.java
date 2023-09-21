package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 1; i < 4; i++) {
            System.out.println("Ball №" + i);
            System.out.println(lottery.getRandomBall());
            System.out.println("----------");
        }
    }
}
