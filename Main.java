public class Main {
    private static final int DRAW_COUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        System.out.println("Drawing " + DRAW_COUNT + " balls:");

        for (int i = 1; i <= DRAW_COUNT; i++) {
            System.out.println("Draw #" + i + ": " + lottery.getRandomBall());
        }
    }
}