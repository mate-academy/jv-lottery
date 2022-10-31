package core.basesyntax;

public class Lottery {
    Ball getRandomBall() {
        return new Ball();
    }

    public static void main(String[] args) {
        System.out.println("Let's begin our lottery!");
        System.out.println("Your balls are:");
        for (int i = 1; i < 4; i++) {
            Lottery lottery = new Lottery();
            System.out.println(lottery.getRandomBall());
        }
        System.out.println("Hope you win!");
    }
}