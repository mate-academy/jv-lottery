package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball randomBall = lottery.getRandomBall();
            StringBuilder nameBall = new StringBuilder(randomBall.getColour());
            System.out.println(nameBall.append(" ").append(randomBall.getNumber()));
        }
    }
}
