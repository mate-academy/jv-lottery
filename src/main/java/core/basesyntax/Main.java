package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Lottery lottery = new Lottery();
            Ball randomBall = lottery.getRandomBall();
            System.out.println("randomBall_" + i + " " + randomBall.toString());
        }
    }

}
